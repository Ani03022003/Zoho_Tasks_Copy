package com.example.databaseapplication.information


import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.databaseapplication.database.InformationDao

class InfoViewModelFactory(
    private val datasource : InformationDao,
    private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(InfoViewModel::class.java)){
            return InfoViewModel(datasource, application) as T
        }
        throw IllegalArgumentException("No such class found")
    }
}