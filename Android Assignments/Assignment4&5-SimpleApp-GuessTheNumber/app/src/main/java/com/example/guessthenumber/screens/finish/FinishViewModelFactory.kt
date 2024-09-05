package com.example.guessthenumber.screens.finish

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FinishViewModelFactory(private val text : String, private  val ans : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(FinishViewModel::class.java)) {
            return FinishViewModel(text,ans) as T
        }
        throw IllegalArgumentException("Class not Found")
    }
}