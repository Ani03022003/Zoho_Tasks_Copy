package com.example.newsfeed.newsDisplay

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.newsfeed.adapter.DisplayAdapter
import com.example.newsfeed.database.NewsDatabase
import com.example.newsfeed.domain.News
import com.example.newsfeed.repository.NewsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NewsListViewModel(
    private val application: Application,
    private val newsAdapter: DisplayAdapter) : AndroidViewModel(application) {

    private val database = NewsDatabase.getInstance(application)
    private val repo = NewsRepository(database)

    private var _dataNull = MutableLiveData<Boolean>()
    val dataNull : LiveData<Boolean>
        get() = _dataNull

    private var _onNewsClicked = MutableLiveData<String?>()
    val onNewsClicked : LiveData<String?>
        get() = _onNewsClicked

    init{
        viewModelScope.launch {
            repo.getUpdatedNews()
        }
    }

    var news = repo.news

//    fun filteredList(newText: String?) {
//        val filteredNews: MutableList<News> = emptyList<News>().toMutableList()
//        for (new in news.value!!) {
//            if (newText != null) {
//                if (new.author.equals(newText, ignoreCase = true) or
//                    new.name.equals(newText, ignoreCase = true) or
//                    new.title.equals(newText, ignoreCase = true) or
//                    (new.content?.contains(newText.toRegex()) == true) or
//                    (new.description?.contains(newText.toRegex()) == true)
//                    )
//                {
//                    filteredNews.add(new)
//                }
//            }
//        }
//
//        if (filteredNews.isEmpty()) {
//            _dataNull.value = true
//            newsAdapter.setFilteredData(news.value!!.toMutableList())
//        } else {
//            newsAdapter.setFilteredData(filteredNews)
//        }
//    }

    fun filteredList(newText: String?) {
        println(newText)
        val filteredNews = news.value?.filter { new ->
            newText?.let {
                new.author.equals(it, ignoreCase = true) ||
                        new.name.equals(it, ignoreCase = true) ||
                        new.title.equals(it, ignoreCase = true) ||
                        new.content?.contains(it.toRegex()) == true ||
                        new.description?.contains(it.toRegex()) == true
            } ?: false
        }.orEmpty().toMutableList()

        if (filteredNews.isEmpty()) {
            _dataNull.value = true
            println("Edukulla")
            newsAdapter.setFilteredData(news.value?.toMutableList() ?: mutableListOf())
        } else {
            println("Adukulla")
            newsAdapter.setFilteredData(filteredNews)
        }
    }


    fun toastFinished() {
        _dataNull.value = false
    }

    fun onNewsClicked(url: String?) {
        _onNewsClicked.value = url
    }

    fun onNewsClickedFinished() {
        _onNewsClicked.value = null
    }
}