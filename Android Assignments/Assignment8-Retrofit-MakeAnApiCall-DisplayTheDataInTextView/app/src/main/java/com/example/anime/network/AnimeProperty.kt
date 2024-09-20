package com.example.anime.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize


@Parcelize
data class AnimeResponse(val results: List<AnimeProperty>) : Parcelable

@Parcelize
data class AnimeProperty(
    @Json(name = "artist_href")val artistHref: String,
    @Json(name = "artist_name")val artistName: String,
    @Json(name = "source_url")val sourceUrl: String,
    @Json(name = "url")val url: String
) : Parcelable