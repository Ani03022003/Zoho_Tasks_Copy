package com.example.dogpics.network

import com.example.dogpics.database.DogEntity
import com.example.dogpics.domain.DogDomain

data class Dog(
    val message: String,
    val status: String
)

fun Dog.asDomainModel() : DogDomain {
    return DogDomain(message = this.message, status = this.status)
}

fun Dog.asDatabaseModel() : Array<DogEntity> {
    return arrayOf(DogEntity(message = this.message, status = this.status))
}