package com.example.harrypotter.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.addAdapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

private const val BASE_URL = "https://potterapi-fedeperin.vercel.app/en/"

private val moshi: Moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

val retrofit: Retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .baseUrl(BASE_URL)
    .build()

interface HPApiService {
    @GET("books")
    fun getBooks() : Deferred<List<BookDataItem>>
    @GET("characters")
    fun getCharacters() : Deferred<List<CharacterDataItem>>
}

object HPApi {
    val retrofitService : HPApiService by lazy {
        retrofit.create(HPApiService::class.java)
    }
}