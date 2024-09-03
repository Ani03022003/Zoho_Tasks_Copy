package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalscore : Int) : ViewModel() {

    private var _finalScore = MutableLiveData<Int>()
    val score : LiveData<Int>
        get() = _finalScore

    private var _onPlay = MutableLiveData<Boolean>()
    val onPlay : LiveData<Boolean>
        get() = _onPlay


    init {
        Log.i("ScoreViewModel","Final Score is $finalscore")
        _finalScore.value = finalscore
        _onPlay.value = false
    }

    fun onPlayAgain(){
        _onPlay.value = true
    }

    fun onPlayAgainComplete(){
        _onPlay.value = false
    }
}