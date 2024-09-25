package com.example.harrypotter.display

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.harrypotter.R
import com.example.harrypotter.databinding.FragmentDisplayBinding
import java.util.Locale

class DisplayFragment : Fragment() {
    private lateinit var binding : FragmentDisplayBinding
    private lateinit var viewModel: DisplayViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_display, container, false)

        val application = requireNotNull(activity).application

        val args = DisplayFragmentArgs.fromBundle(requireArguments()).request.lowercase(Locale.ROOT)

        val viewModelFactory = DisplayViewModelFactory(args, application)

        viewModel = ViewModelProvider(this, viewModelFactory)[DisplayViewModel::class.java]

        binding.viewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

//        val adapter = DisplayAdapter(emptyList())
//        binding.recyclerView.adapter = adapter

        viewModel.data.observe(viewLifecycleOwner, Observer { data ->
            data?.let {
                val adapter = DisplayAdapter(data)
                binding.recyclerView.adapter = adapter
                adapter.submitList(data)
            }
        })
//        Toast.makeText(context, args, Toast.LENGTH_LONG).show()
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        Log.i("DisplayFragment", binding.mainLayout.fitsSystemWindows.toString())
    }
}