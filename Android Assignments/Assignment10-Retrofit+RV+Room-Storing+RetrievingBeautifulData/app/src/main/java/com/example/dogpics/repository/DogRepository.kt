package com.example.dogpics.repository;

import androidx.lifecycle.map
import com.example.dogpics.database.DogDatabase;
import com.example.dogpics.database.asDomainModel
import com.example.dogpics.network.DogService
import com.example.dogpics.network.asDatabaseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class DogRepository(private val database: DogDatabase){

    val dogPics = database.DogDatabaseDao.getAllDogs().map {
        it.asDomainModel()
    }

    suspend fun refreshPics(){
        withContext(Dispatchers.IO){
            val dogPic = DogService.retroFitService.getPics().await()
            database.DogDatabaseDao.insertAll(dogPic.asDatabaseModel())
        }
    }
}
