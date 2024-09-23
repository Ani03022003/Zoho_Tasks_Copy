package com.example.harrypotter.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize


@Parcelize
data class BookDataItem(
    @Json(name = "cover") override val imgUrl: String,
    val description: String,
    @Json(name = "index") override val id: Int,
    val number: Int,
    @Json(name = "originalTitle") override val name: String,
    val pages: Int,
    val releaseDate: String,
    val title: String
) : Parcelable, DataItem(imgUrl, id, name)