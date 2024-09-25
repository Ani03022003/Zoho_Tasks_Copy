package com.example.dogpics.display

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dogpics.database.DogDatabase
import com.example.dogpics.repository.DogRepository
import kotlinx.coroutines.launch

class DisplayViewModel (private val application: Application) : AndroidViewModel(application) {


    private val database = DogDatabase.getInstance(application)
    private val dogRepository = DogRepository(database)

    init {
        viewModelScope.launch {
            dogRepository.refreshPics()
        }
    }

    val dogPics = dogRepository.dogPics

}