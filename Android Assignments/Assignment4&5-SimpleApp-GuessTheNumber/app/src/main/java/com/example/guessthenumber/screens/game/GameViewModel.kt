package com.example.guessthenumber.screens.game

import android.os.CountDownTimer
import android.text.format.DateUtils
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import kotlin.math.abs
import kotlin.random.Random

private const val MAX_VALUE = 20

class GameViewModel : ViewModel() {

    companion object{
        private const val DONE = 0L
        private const val ONE_SEC = 1000L
        private const val COUNTDOWN_TIME = 10000L
    }

    val wonString = "You Won"
    val loseString = "You lost"

    val randomNumber : Int = Random.nextInt(1, MAX_VALUE)

    private var _correctGuess = MutableLiveData<Boolean>()
    val correctGuess : LiveData<Boolean>
        get() = _correctGuess

    private var _hint = MutableLiveData<String>()
    val hint : LiveData<String>
        get() = _hint

    private var _noOfGuess = MutableLiveData<Int>()
    val noOfGuess : LiveData<Int>
        get() = _noOfGuess

    private var _over = MutableLiveData<Boolean>()
    val over : LiveData<Boolean>
        get() = _over

    private var _currentTime = MutableLiveData<Long>()
    val currentTime : LiveData<String>
        get() = _currentTime.map{
            time -> DateUtils.formatElapsedTime(time)
        }

    private val timer : CountDownTimer

    init{
        _noOfGuess.value = 5
        _correctGuess.value = false
        _over.value = false
        _hint.value = "Make your guess"
        timer = object : CountDownTimer(COUNTDOWN_TIME, ONE_SEC) {
            override fun onTick(p0: Long) {
                _currentTime.value = (p0 / ONE_SEC)
            }

            override fun onFinish() {
                _currentTime.value = DONE
                Over()
            }
        }

        timer.start()
    }

    override fun onCleared() {
        super.onCleared()
        timer.cancel()
    }

    fun check(num : String){
        if(_noOfGuess.value!! <= 1){
            Over()
        }
        else if(num.toInt() == randomNumber){
            _correctGuess.value = true
        }
        else if(abs(num.toInt()-randomNumber) <= 3){
            _hint.value = "You are near!!!"
            _noOfGuess.value = (_noOfGuess.value)?.minus(1)
            Log.i("GameViewModel","In check - You are near")
        }
        else {
            _hint.value = "Guessing is far"
            _noOfGuess.value = (_noOfGuess.value)?.minus(1)
            Log.i("GameViewModel","In check - Guessing is Far")
        }
    }

    private fun Over() {
        _over.value = true
    }

    fun onOver(){
        _over.value = false
    }

    fun onCorrectGuess(){
        _correctGuess.value = false
    }
}