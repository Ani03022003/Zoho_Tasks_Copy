package com.example.guessthenumber.screens.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.guessthenumber.R
import com.example.guessthenumber.databinding.GameFragmentBinding

class GameFragment : Fragment() {
    private lateinit var viewModel: GameViewModel
    private lateinit var binding: GameFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.game_fragment,container,false)

        viewModel = ViewModelProvider(this)[GameViewModel::class.java]

        binding.isItCorrectButton.setOnClickListener{
            viewModel.check(binding.numText.text.toString())
        }

        

        return binding.root
    }

}