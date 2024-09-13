package com.example.databaseapplication.display

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.databaseapplication.database.Information
import com.example.databaseapplication.database.InformationDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DisplayViewModel(
    val database : InformationDao,
    application: Application) : ViewModel() {

    private val viewModelJob = Job()

    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    val currentData = MutableLiveData<Information?>()

    var phoneNum = MutableLiveData<String>()

    init{
        getCurrentData()
        Log.i("DisplayViewModel","${phoneNum.value}")
    }

    private fun getCurrentData() {
        uiScope.launch {
            currentData.value = getCurrentDataFromDatabase()
            phoneNum.value = currentData.value?.phoneNo.toString()
            Log.i("DisplayViewModel", "${phoneNum.value}")
        }
    }

    private suspend fun getCurrentDataFromDatabase(): Information? {
        return withContext(Dispatchers.IO){
            database.getCurrent()
        }
    }

    fun onClickClear(){
        uiScope.launch {
            withContext(Dispatchers.IO){
                database.clear()
            }
            currentData.value = null
            phoneNum.value = ""
        }
    }


}