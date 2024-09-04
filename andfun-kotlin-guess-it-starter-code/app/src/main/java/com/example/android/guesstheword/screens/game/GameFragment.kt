/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.guesstheword.screens.game

import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.text.format.DateUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.getSystemService
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
//import androidx.navigation.Navigation.findNavController
//import androidx.navigation.fragment.NavHostFragment.findNavController
import com.example.android.guesstheword.R
import com.example.android.guesstheword.databinding.GameFragmentBinding
import com.google.android.gms.common.util.DataUtils

/**
 * Fragment where the game is played
 */
class GameFragment : Fragment() {

    private lateinit var viewModel: GameViewModel

    private lateinit var binding: GameFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.game_fragment,
                container,
                false
        )

        Log.i("GameFragment","GameFragment Created")
        viewModel = ViewModelProvider(this)[GameViewModel::class.java]

//        resetList()
//        nextWord()

        binding.gameViewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

//        binding.correctButton.setOnClickListener {
//            viewModel.onCorrect()
//        }
//        binding.skipButton.setOnClickListener {
//            viewModel.onSkip()
//        }

//        viewModel.score.observe(viewLifecycleOwner, Observer { newScore ->
//            binding.scoreText.text = newScore.toString()
//        })
//
//        viewModel.word.observe(viewLifecycleOwner, Observer { newWord ->
//            binding.wordText.text = newWord.toString()
//        })

        viewModel.buzz.observe(viewLifecycleOwner, Observer{ buzzState ->
            buzz(buzzState.Pattern)
        })

        viewModel.gameFinished.observe(viewLifecycleOwner, Observer { hasFinished ->
            if(hasFinished){
                gameFinished()
                //viewModel.onBuzzFinished()
                viewModel.onGameFinished()
            }
        })



//        viewModel.currentTime.observe(viewLifecycleOwner, Observer { newTime ->
//            binding.timerText.text = newTime
//        })

        return binding.root
    }

    /**
     * Called when the game is finished
     */
    private fun gameFinished() {
        Log.i("GameFragment", "on gameFinished")
        val action = GameFragmentDirections.actionGameToScore(viewModel.score.value ?: 0)
//        val currentScore = viewModel.score.value ?: 0
//        action.setScore(currentScore)
        findNavController(this).navigate(action)
    }

    private fun buzz(pattern: LongArray){
        val buzzer = activity?.getSystemService<Vibrator>()

        buzzer?.let {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                buzzer.vibrate(VibrationEffect.createWaveform(pattern, -1))
            }
            else {
                buzzer.vibrate(pattern, -1)
            }
        }
    }
}
