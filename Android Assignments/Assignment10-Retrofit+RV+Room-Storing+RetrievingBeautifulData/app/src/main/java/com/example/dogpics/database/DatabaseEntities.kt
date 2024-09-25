package com.example.dogpics.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dogpics.domain.DogDomain

@Entity(tableName = "dogs")
data class DogEntity(
    @PrimaryKey
    val message : String,
    val status : String
)

fun List<DogEntity>.asDomainModel() : List<DogDomain> {
    return map{
        DogDomain(
            message = it.message,
            status = it.status
        )
    }
}