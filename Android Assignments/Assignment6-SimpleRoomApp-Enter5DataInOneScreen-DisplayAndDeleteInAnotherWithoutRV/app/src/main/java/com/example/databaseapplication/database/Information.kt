package com.example.databaseapplication.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.util.Date

@Entity(tableName = "information_table", indices = [Index(value = ["zoho_schools_id", "email_id"], unique = true)])
data class Information (

    @ColumnInfo(name = "zoho_schools_id")
    var zsId : String = "",

    @ColumnInfo(name = "phone_number")
    var phoneNo : Long = 0L,

    @ColumnInfo(name = "name")
    var name : String = "",

    @ColumnInfo(name = "email_id")
    var email : String = "",

    @ColumnInfo(name = "date_of_birth")
    var dob : String = "",

    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "serial_no")
    var sno : Int = 0

)