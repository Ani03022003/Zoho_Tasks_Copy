package com.example.displaycolors.display

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DisplayViewModel : ViewModel() {

    var colors = arrayOf(
        "Red",
        "Green",
        "Blue",
        "Orange",
        "Yellow",
        "Brown",
        "Grey"
    )

    private var _onNextFragment = MutableLiveData<Boolean>()
    val onNextFragment : LiveData<Boolean>
        get() = _onNextFragment

    fun onClickNext(){
        _onNextFragment.value = true
    }

    fun onClickNextFinished() {
        _onNextFragment.value = false
    }


}