package com.example.anime.imagedisplay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.anime.R
import com.example.anime.databinding.FragmentImageBinding

class ImageFragment : Fragment() {
    private lateinit var binding : FragmentImageBinding
    private lateinit var viewModel: ImageViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_image,container,false)

        val args = ImageFragmentArgs.fromBundle(requireArguments()).animePic

        val application = requireNotNull(activity).application

        val viewModelFactory = ImageViewModelFactory(args, application)

        viewModel = ViewModelProvider(this, viewModelFactory)[ImageViewModel::class.java]

        binding.viewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}