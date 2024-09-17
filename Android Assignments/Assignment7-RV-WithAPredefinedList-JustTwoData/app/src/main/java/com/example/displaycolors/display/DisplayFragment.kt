package com.example.displaycolors.display

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.displaycolors.R
import com.example.displaycolors.databinding.FragmentDisplayBinding

class DisplayFragment : Fragment() {
    private lateinit var binding : FragmentDisplayBinding
    private lateinit var viewModel : DisplayViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_display,container,false)

        val viewModelFragment = DisplayViewModelFactory()

        viewModel = ViewModelProvider(this, viewModelFragment)[DisplayViewModel::class.java]

        binding.displayViewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.onNextFragment.observe(viewLifecycleOwner, Observer {
            if(it) {
                    findNavController().navigate(
                        DisplayFragmentDirections.actionDisplayFragmentToRecycleViewFragment(
                            viewModel.colors
                        )
                    )
                viewModel.onClickNextFinished()
            }
        })

        return binding.root
    }

}