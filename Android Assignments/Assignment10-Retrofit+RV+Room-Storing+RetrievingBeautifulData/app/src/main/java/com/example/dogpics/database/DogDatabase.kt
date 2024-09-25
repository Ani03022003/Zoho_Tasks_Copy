package com.example.dogpics.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DogEntity::class], version = 1, exportSchema = false)
abstract class DogDatabase : RoomDatabase() {

    abstract val DogDatabaseDao : DogDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE : DogDatabase? = null

        fun getInstance(context: Context) : DogDatabase {
            synchronized(this){
                var instance = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        DogDatabase::class.java,
                        "dogs"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}