package com.example.databaseapplication.information

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.databaseapplication.database.Information
import com.example.databaseapplication.database.InformationDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class InfoViewModel(
    val database : InformationDao,
    application: Application ) : ViewModel() {

    //private var currentData = MutableLiveData<Information?>()

    var zsId = MutableLiveData<String>()

    var phoneNo = MutableLiveData<String>()

    var name = MutableLiveData<String>()

    var email = MutableLiveData<String>()

    var dob = MutableLiveData<String>()

    private var _onNull = MutableLiveData<Boolean>()
    val onNull : LiveData<Boolean>
        get() = _onNull

    private var _navigateToDisplay = MutableLiveData<Boolean>()
    val navigateToDisplay : LiveData<Boolean>
        get() = _navigateToDisplay

    private val viewModelJob = Job()

    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    init{
        Log.i("InfoViewModel", "${name.value} , ${zsId.value} , ${phoneNo.value} , ${email.value} , ${dob.value}")
        name.value = ""
        zsId.value = ""
        phoneNo.value = ""
        email.value = ""
        dob.value = ""
    }

    fun onSave(){
        uiScope.launch {
            if (zsId.value != null && phoneNo.value != null && name.value != null && email.value != null && dob.value != null) {
                val id = zsId.value
                val pno = phoneNo.value?.toLong()
                val nam = name.value
                val em = email.value
                val date = dob.value
                if (id != null && pno != null && nam != null && em != null && date != null) {
                    val newData = Information(
                        id,
                        pno,
                        nam,
                        em,
                        date
                    )

                    insertDatabase(newData)

                    _navigateToDisplay.value = true
                }
                else {
                    Log.i("InfoViewMode", "In inner if")
                    _onNull.value = true
                }
            }
            else{
                Log.i("InfoViewMode", "In outer if")
                _onNull.value = true
            }
        }
    }

    private suspend fun insertDatabase(newData: Information) {
        withContext(Dispatchers.IO){
            database.insert(newData)
        }
    }

    fun onNullFinished(){
        _onNull.value = false
    }

    fun onNavigationFinish(){
        _navigateToDisplay.value = false
    }

    override fun onCleared() {
        super.onCleared()
        uiScope.cancel()
    }

    fun clearText(){
        zsId.value = ""
        name.value = ""
        phoneNo.value = ""
        email.value = ""
        dob.value = ""
    }
}