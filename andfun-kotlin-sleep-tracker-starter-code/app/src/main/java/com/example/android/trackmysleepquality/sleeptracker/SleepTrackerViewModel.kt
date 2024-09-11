/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackmysleepquality.sleeptracker

import android.app.Application
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.map
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.formatNights
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * ViewModel for SleepTrackerFragment.
 */
class SleepTrackerViewModel(
        val database: SleepDatabaseDao,
        application: Application) : AndroidViewModel(application) {

                // Creating Job.
        private var viewModelJob = Job()

                //Define Scope for Coroutines which determine in what thread it will run on.
                //It needs to know about the job, so pass the dispatcher with the job.
                //This means the coroutine on UI Scope will run on main thread.
        private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

                //Variable to hold the current night
        private var toNight = MutableLiveData<SleepNight?>()

                //While creating the ViewModel we need all the nights. So, call the getAll() to get all the nights from the database.
        private val nights = database.getAll()

        val nightString = nights.map {
                nights -> formatNights(nights, application.resources)
        }

                //Navigate from SleepTracker Fragment to SleepQuality Fragment
        private val _navigateToSleepQuality = MutableLiveData<SleepNight>()
        val navigateToSleepQuality : LiveData<SleepNight>
                get() = _navigateToSleepQuality

        init {
                //Initialize tonight as soon as possible to work with it.
            initializeTonight()
        }

                //Function to initialize tonight.
        private fun initializeTonight() {
                uiScope.launch {
                        toNight.value = getTonightFromDatabase()
                }
        }
                //Suspend function to run this process in a separate thread, Use Dispatchers.IO for database input/output.
                //Return context with different thread.
                //And grt the latest night from the database
        private suspend fun getTonightFromDatabase(): SleepNight? {
                return withContext(Dispatchers.IO){
                        var night = database.getCurrent()
                        if(night?.startTimeMilli != night?.endTimeMilli){
                                night = null
                        }
                        night
                }
        }

                //Create a new sleepNight, insert it into the database, and assign it to the toNight.
        fun onStartTracking(){
                uiScope.launch {
                        val newNight = SleepNight()
                        insert(newNight)
                        toNight.value = getTonightFromDatabase()
                }
        }
        private suspend  fun insert(newNight: SleepNight) {
                return withContext(Dispatchers.IO){
                        database.insert(newNight)
                }
        }

                //Function to stop the tracker.
        fun onStopTracing(){
                uiScope.launch {
                        val oldNight = toNight.value ?: return@launch
                        oldNight.endTimeMilli = System.currentTimeMillis()
                        update(oldNight)
                        _navigateToSleepQuality.value = oldNight
                }
        }
        private suspend  fun update(oldNight: SleepNight) {
                return withContext(Dispatchers.IO) {
                        database.update(oldNight)
                }
        }

                //Function the clear the screen
        fun onClear(){
                uiScope.launch {
                        clear()
                        toNight.value = null
                }
        }
        private suspend fun clear(){
                return withContext(Dispatchers.IO) {
                        database.clean()
                }
        }

        fun doneNavigating() {
                _navigateToSleepQuality.value = null
        }

        //Cancel all Coroutines.
        override fun onCleared() {
                super.onCleared()
                viewModelJob.cancel()
        }

        /*********************************************************
        Common pattern to write a coroutine and suspend function
                fun someWorkNeedsToBeDone {
                        uiScope.launch{
                                suspendFunction()
                        }
                }

                suspend fun suspendFunction() {
                        return withContext(Dispatcher.IO) {
                                longRunningWork()
                        }
                }
        ***********************************************************/
}

