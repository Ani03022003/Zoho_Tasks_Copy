package com.example.databaseapplication.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Information::class], version = 2, exportSchema = false)
abstract  class InformationDatabase : RoomDatabase() {

    abstract fun informationDatabaseDao() : InformationDao

    companion object{

        @Volatile
        private var INSTANCE : InformationDatabase? = null

        fun getInstance(context : Context) : InformationDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(
                                context.applicationContext,
                                InformationDatabase::class.java,
                                "information_table")
                        .fallbackToDestructiveMigration()
                        .build()
                        INSTANCE = instance
                }
                return instance
            }
        }
    }
}