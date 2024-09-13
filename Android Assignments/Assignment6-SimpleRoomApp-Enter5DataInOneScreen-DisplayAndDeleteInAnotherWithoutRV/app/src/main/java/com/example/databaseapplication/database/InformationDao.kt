package com.example.databaseapplication.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface InformationDao {

    @Insert
    fun insert(data: Information)

    @Update
    fun update(data: Information)

    @Query("delete from information_table")
    fun clear()

    @Query("select * from information_table order by serial_no desc limit 1")
    fun getCurrent() : Information?
}