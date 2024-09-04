package com.example.guessthenumber.screens.game

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.abs
import kotlin.random.Random

private const val MAX_VALUE = 20

class GameViewModel : ViewModel() {

    private val randomNumber : Int = Random.nextInt(1, MAX_VALUE)

    private var _correctGuess = MutableLiveData<Boolean>()
    val correctGuess : LiveData<Boolean>
        get() = _correctGuess

    private var _hint = MutableLiveData<String>()
    val hint : LiveData<String>
        get() = _hint

    private var _noOfGuess = MutableLiveData<Int>()
    val noOfGuess : LiveData<Int>
        get() = _noOfGuess

    init{
        _noOfGuess.value = 5
    }

    fun check(num : String){
        if(num.toInt() == randomNumber){
            _correctGuess.value = true
        }
        else if(abs(num.toInt()-randomNumber) <= 5){
            _hint.value = "You are near!!!"
            _noOfGuess.value = (_noOfGuess.value)?.minus(1)
        }
        else {
            _hint.value = "Guessing is far"
            _noOfGuess.value = (_noOfGuess.value)?.minus(1)
        }
    }
}