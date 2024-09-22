package com.example.harrypotter.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class CharacterDataItem(
    val birthdate: String,
    val children: List<String>,
    @Json(name = "fullName")val name: String,
    val hogwartsHouse: String,
    @Json(name = "image")val imgUrl: String,
    @Json(name = "index")val id: Int,
    val interpretedBy: String,
    val nickname: String
) : Parcelable