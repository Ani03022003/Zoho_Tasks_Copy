package com.example.harrypotter.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class CharacterDataItem(
    val birthdate: String,
    val children: List<String>,
    @Json(name = "fullName") override val name: String,
    val hogwartsHouse: String,
    @Json(name = "image") override val imgUrl: String,
    @Json(name = "index") override val id: Int,
    val interpretedBy: String,
    val nickname: String
) : Parcelable, DataItem(imgUrl, id, name)