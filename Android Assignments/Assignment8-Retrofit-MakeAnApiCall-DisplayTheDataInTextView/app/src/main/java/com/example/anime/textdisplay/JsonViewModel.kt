package com.example.anime.textdisplay

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.example.anime.R
import com.example.anime.network.AnimeApi
import com.example.anime.network.AnimeProperty
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

enum class ApiStatus {
    START,
    LOADING,
    FINISH,
    ERROR,
    DONE
}
class JsonViewModel(
    private val application: Application): AndroidViewModel(application) {

    private val coroutineJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + coroutineJob)

    private var _status = MutableLiveData<ApiStatus>()
    val status : LiveData<ApiStatus>
        get() = _status

    private var _anime = MutableLiveData<AnimeProperty>()
    val anime : LiveData<AnimeProperty>
        get() = _anime

    private var _displayText = MutableLiveData<LiveData<String>>()
    val displayText : LiveData<LiveData<String>>
        get() = _displayText



    fun generateList(){
        uiScope.launch {
            val animeListDeferred =  AnimeApi.retrofitService.getProperties(20)
            try {
                _status.value = ApiStatus.LOADING
                val animeList = animeListDeferred.await()
                _status.value = ApiStatus.FINISH
                _anime.value = animeList.results.random()
                _displayText.value = _anime.map {
                    application.applicationContext.getString(R.string.anime_info, it.artistHref, it.artistName, it.sourceUrl, it.url)
                }
            }
            catch(e : Exception){
                _status.value = ApiStatus.ERROR
            }
        }
    }

    fun navigateToFragment(){
        if(_status.value == ApiStatus.START){
            _status.value = ApiStatus.ERROR
        }
        else{
            _status.value = ApiStatus.DONE
        }
    }

    fun doneNavigating() {
        _status.value = ApiStatus.START
    }

    fun clearJson() {
        _displayText = MutableLiveData<LiveData<String>>()
    }

    override fun onCleared() {
        super.onCleared()
        coroutineJob.cancel()
    }
}