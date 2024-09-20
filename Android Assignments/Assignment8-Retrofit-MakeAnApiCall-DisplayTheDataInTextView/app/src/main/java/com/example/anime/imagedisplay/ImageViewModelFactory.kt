package com.example.anime.imagedisplay

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.anime.network.AnimeProperty

class ImageViewModelFactory(private val args: AnimeProperty?, private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if(modelClass.isAssignableFrom(ImageViewModel::class.java))
            return ImageViewModel(args, application) as T
        throw IllegalArgumentException("Class Not found")
    }
}