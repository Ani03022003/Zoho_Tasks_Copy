package com.example.guessthenumber.screens.finish

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FinishViewModel(text : String, ans : Int) : ViewModel() {

    private var _finalText = MutableLiveData<String>()
    val finalText : LiveData<String>
        get() = _finalText

    private var _finalAns = MutableLiveData<Int>()
    val finalAns : LiveData<Int>
        get() = _finalAns

    private var _onPlay = MutableLiveData<Boolean>()
    val onPlay : LiveData<Boolean>
        get() = _onPlay

    init{
        _finalText.value = text
        _finalAns.value = ans
        _onPlay.value = false
        Log.i("FinishViewModel","Text: $finalText, Ans: $finalAns")
    }

    fun onPlayAgain(){
        _onPlay.value = true
    }

    fun onPlayAgainComplete(){
        _onPlay.value = false
    }
}