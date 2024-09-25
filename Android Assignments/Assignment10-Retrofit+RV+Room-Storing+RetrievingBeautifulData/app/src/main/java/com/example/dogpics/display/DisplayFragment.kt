package com.example.dogpics.display

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.dogpics.R
import com.example.dogpics.adapter.DisplayAdapter
import com.example.dogpics.databinding.FragmentDisplayBinding

class DisplayFragment : Fragment() {
    private lateinit var binding : FragmentDisplayBinding
    private lateinit var viewModel: DisplayViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_display, container, false)

        val application = requireNotNull(activity).application

        val viewModelFactory = DisplayViewModelFactory(application)

        viewModel = ViewModelProvider(this, viewModelFactory)[DisplayViewModel::class.java]

        val displayAdapter = DisplayAdapter()

        binding.scrollView.adapter = displayAdapter

        viewModel.dogPics.observe(viewLifecycleOwner, Observer { pics ->
            displayAdapter.data = pics
        })

        return binding.root
    }

}