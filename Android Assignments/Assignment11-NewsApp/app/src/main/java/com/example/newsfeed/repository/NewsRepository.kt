package com.example.newsfeed.repository

import androidx.lifecycle.map
import com.example.newsfeed.database.NewsDatabase
import com.example.newsfeed.database.asDomainModel
import com.example.newsfeed.network.NewsApi
import com.example.newsfeed.network.asDatabaseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NewsRepository(private val database: NewsDatabase) {

    val news = database.newsDatabaseDao.getNews().map {
        it.asDomainModel()
    }

    suspend fun getUpdatedNews(){
        withContext(Dispatchers.IO){
            val updatedNews = NewsApi.retrofitService.getNews(from = "2024-09-27").await()
            database.newsDatabaseDao.insertAll(*updatedNews.asDatabaseModel())
        }
    }
}