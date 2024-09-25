package com.example.dogpics.display

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras

class DisplayViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if(modelClass.isAssignableFrom(DisplayViewModel::class.java))
            return DisplayViewModel(application) as T
        throw IllegalArgumentException("Class Not Found")
    }
}