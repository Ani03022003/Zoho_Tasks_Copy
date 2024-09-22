package com.example.harrypotter.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize


@Parcelize
data class BookDataItem(
    @Json(name = "cover")val imgUrl: String,
    val description: String,
    @Json(name = "index")val id: Int,
    val number: Int,
    @Json(name = "originalTitle")val name: String,
    val pages: Int,
    val releaseDate: String,
    val title: String
) : Parcelable