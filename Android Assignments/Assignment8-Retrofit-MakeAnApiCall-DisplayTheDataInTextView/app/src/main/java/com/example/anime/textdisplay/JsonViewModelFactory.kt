package com.example.anime.textdisplay

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras

class JsonViewModelFactory(
    val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if(modelClass.isAssignableFrom(JsonViewModel::class.java))
            return JsonViewModel(application) as T
        throw IllegalArgumentException("Class not found")
    }
}