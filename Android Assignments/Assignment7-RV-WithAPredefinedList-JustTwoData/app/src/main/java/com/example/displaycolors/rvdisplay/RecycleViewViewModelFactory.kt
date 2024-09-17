package com.example.displaycolors.rvdisplay

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras

class RecycleViewViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if(modelClass.isAssignableFrom(RecycleViewViewModel::class.java))
            return RecycleViewViewModel() as T
        throw IllegalArgumentException("Class Not Found")
    }
}