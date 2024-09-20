package com.example.anime.imagedisplay

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.anime.R
import com.example.anime.network.AnimeProperty

class ImageViewModel(
    private val animeProperty: AnimeProperty?,
    private val application: Application) : ViewModel() {

    private var _name = MutableLiveData<String>()
    val name : LiveData<String>
        get() = _name

    private var _href = MutableLiveData<String>()
    val href : LiveData<String>
        get() = _href

    private var _url = MutableLiveData<String>()
    val url : LiveData<String>
        get() = _url

    init {
        _name.value = animeProperty?.artistName?.let {
            application.applicationContext.getString(R.string.Name, it)
        }

        _href.value = animeProperty?.artistHref?.let {
            application.applicationContext.getString(R.string.Href, it)
        }

        _url.value = animeProperty?.url
    }

}