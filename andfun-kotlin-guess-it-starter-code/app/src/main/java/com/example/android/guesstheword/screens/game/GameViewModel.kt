package com.example.android.guesstheword.screens.game

import android.os.CountDownTimer
import android.text.format.DateUtils
import android.util.Log
import android.view.animation.Transformation
import androidx.constraintlayout.widget.ConstraintSet.Transform
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

private val CORRECT_BUZZ_PATTERN = longArrayOf(100,100,100,100,100,100)
private val PANIC_BUZZ_PATTERN = longArrayOf(0,200)
private val GAME_OVER_BUZZ_PATTERN =  longArrayOf(0,2000)
private val NO_BUZZ_PATTERN = longArrayOf(0)

enum class BuzzType(val Pattern : LongArray){
    CORRECT(CORRECT_BUZZ_PATTERN),
    GAME_OVER(GAME_OVER_BUZZ_PATTERN),
    COUNTDOWN_PANIC(PANIC_BUZZ_PATTERN),
    NO_BUZZ(NO_BUZZ_PATTERN);
}
class GameViewModel : ViewModel() {

    companion object{
        private const val DONE = 0L
        private const val ONE_SEC = 1000L
        private const val COUNTDOWN_TIME = 60000L
    }

    // The current word
    private var _word = MutableLiveData<String>()
    val word : LiveData<String>
        get() = _word

    // The current score
    private var _score = MutableLiveData<Int>()
    val score : LiveData<Int>
        get() = _score

    private var _gameFinished = MutableLiveData<Boolean>()
    val gameFinished : LiveData<Boolean>
        get() =_gameFinished

    private var _currentTime = MutableLiveData<Long>()
    val currentTime : LiveData<Long>
        get() = _currentTime

    val newTime = _currentTime.map {
        time -> DateUtils.formatElapsedTime(time)
    }

    private var _buzz = MutableLiveData<BuzzType>()
    val buzz : LiveData<BuzzType>
        get() = _buzz

//    private var time = DONE

    private val timer : CountDownTimer

    private lateinit var wordList: MutableList<String>

    init{
        _gameFinished.value = false
        Log.i("GameViewModel","GameViewModel Created")
        resetList()
        nextWord()
        _score.value = 0
        timer = object : CountDownTimer(COUNTDOWN_TIME, ONE_SEC) {
            override fun onTick(p0: Long) {
                _currentTime.value = (p0 / ONE_SEC)
                if(p0 < COUNTDOWN_TIME / 4){
                    onBuzz(BuzzType.COUNTDOWN_PANIC)
                }
            }
            override fun onFinish() {
                _currentTime.value = DONE
                onBuzz(BuzzType.GAME_OVER)
                _gameFinished.value = true
            }
        }
        timer.start()
    }

    override fun onCleared() {
        super.onCleared()
        timer.cancel()
        Log.i("GameViewModel","GameViewModel Destroyed")
    }

    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }

    /**
     * Moves to the next word in the list
     */
    private fun nextWord() {
        //Select and remove a word from the list
        if (wordList.isEmpty()) {
//            _gameFinished.value=true
            resetList()
        }
        _word.value = wordList.removeAt(0)
    }

    /** Methods for buttons presses **/

    fun onSkip() {
        _score.value = (_score.value)?.minus(1)
        //onBuzz(BuzzType.NO_BUZZ)
        nextWord()
    }

    fun onCorrect() {
        _score.value = (_score.value)?.plus(1)
        onBuzz(BuzzType.CORRECT)
        nextWord()
    }

    fun onGameFinished() {
        _gameFinished.value = false
    }

    fun onBuzz(buzzType : BuzzType){
        _buzz.value = buzzType
    }

//    fun onBuzzFinished(){
//        _buzz.value = BuzzType.NO_BUZZ
//    }
}