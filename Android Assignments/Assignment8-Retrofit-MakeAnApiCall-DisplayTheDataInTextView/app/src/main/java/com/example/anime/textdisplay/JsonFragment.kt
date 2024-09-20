package com.example.anime.textdisplay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.anime.R
import com.example.anime.databinding.FragmentJsonBinding

class JsonFragment : Fragment() {
    private lateinit var binding : FragmentJsonBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_json,container,false)

        val application = requireNotNull(activity).application

        val viewModelFactory = JsonViewModelFactory(application)

        val viewModel = ViewModelProvider(this)[JsonViewModel::class.java]

        binding.viewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}