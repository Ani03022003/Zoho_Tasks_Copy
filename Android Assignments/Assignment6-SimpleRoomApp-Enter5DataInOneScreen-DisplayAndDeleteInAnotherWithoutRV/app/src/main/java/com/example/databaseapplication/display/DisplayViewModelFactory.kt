package com.example.databaseapplication.display

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.databaseapplication.database.InformationDao

class DisplayViewModelFactory(
    private val datasource: InformationDao,
    private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if(modelClass.isAssignableFrom(DisplayViewModel::class.java)){
            return DisplayViewModel(datasource, application) as T
        }
        throw IllegalArgumentException("Class does not exist")
    }
}