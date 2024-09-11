package com.example.count

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityViewModel : ViewModel() {

    private var _counter = MutableLiveData<Int>()
    val counter : LiveData<Int>
        get() = _counter

    init{
        _counter.value = 0
    }

    fun onPlus() {
        _counter.value = _counter.value?.plus(1)
    }

    fun onMinus() {
        _counter.value = _counter.value?.minus(1)
    }
}