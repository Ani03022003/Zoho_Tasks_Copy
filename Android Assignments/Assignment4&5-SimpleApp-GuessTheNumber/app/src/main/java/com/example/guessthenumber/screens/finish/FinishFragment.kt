package com.example.guessthenumber.screens.finish

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.guessthenumber.R
import com.example.guessthenumber.databinding.FinishFragmentBinding
import com.example.guessthenumber.databinding.GameFragmentBinding

class FinishFragment : Fragment() {

    private lateinit var binding: FinishFragmentBinding
    private lateinit var viewModel: FinishViewModel
    private lateinit var viewModelFactory : FinishViewModelFactory
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.finish_fragment,container,false)

        //val args = FinishFragmentArgs.fromBundlee()

        binding.lifecycleOwner = viewLifecycleOwner

        viewModelFactory = FinishViewModelFactory(
            FinishFragmentArgs.fromBundle(requireArguments()).simpleText,
            FinishFragmentArgs.fromBundle(requireArguments()).answer
        )
        val args = FinishFragmentArgs.fromBundle(requireArguments())
        viewModel = ViewModelProvider(this, viewModelFactory)[FinishViewModel::class.java]

        binding.finishViewModel = viewModel

        Log.i("FinishFragment","Text: ${args.simpleText}, Answer: ${args.answer}")

        viewModel.onPlay.observe(viewLifecycleOwner, Observer { playAgain ->
            if(playAgain){
                findNavController().navigate(FinishFragmentDirections.actionFinishFragmentToGameFragment2())
                viewModel.onPlayAgainComplete()
            }
        })

        return binding.root
    }

}