package com.example.dogpics.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DogDatabaseDao {
    @Query("select * from dogs")
    fun getAllDogs() : LiveData<List<DogEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg : DogEntity)
}