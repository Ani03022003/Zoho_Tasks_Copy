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
    LOADING,
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

    fun generateList(){
        uiScope.launch {
            val animeListDeferred =  AnimeApi.retrofitService.getProperties(20)
            try {
                _status.value = ApiStatus.LOADING
                val animeList = animeListDeferred.await()
                _status.value = ApiStatus.DONE
                _anime.value = animeList.results.random()
            }
            catch(e : Exception){
                _status.value = ApiStatus.ERROR
            }
        }
    }

    var displayText = _anime.map {
        application.applicationContext.getString(R.string.anime_info, it.artistHref, it.artistName, it.sourceUrl, it.url)
    }

    override fun onCleared() {
        super.onCleared()
        coroutineJob.cancel()
    }
}