package com.example.harrypotter.display

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.harrypotter.network.DataItem
import com.example.harrypotter.network.HPApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

enum class ApiStatus {
    LOADING,
    ERROR,
    DONE
}
class DisplayViewModel(args: String, application: Application) : ViewModel() {

    private val job = Job()

    private var uiScope = CoroutineScope(Dispatchers.Main + job)

    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private var _data = MutableLiveData<List<DataItem>>()
    val data: LiveData<List<DataItem>>
        get() = _data

    init{
        getData(args)
    }

    private fun getData(args: String) {
        uiScope.launch {
            val getDataDeferred : Deferred<List<DataItem>> = if(args == "books"){
                HPApi.retrofitService.getBooks()
            } else{
                HPApi.retrofitService.getCharacters()
            }
            try {
                _status.value = ApiStatus.LOADING
                val listResult = getDataDeferred.await()
                _status.value = ApiStatus.DONE
                _data.value = listResult
            }
            catch (e : Exception){
                _status.value = ApiStatus.ERROR
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        uiScope.cancel()
    }
}