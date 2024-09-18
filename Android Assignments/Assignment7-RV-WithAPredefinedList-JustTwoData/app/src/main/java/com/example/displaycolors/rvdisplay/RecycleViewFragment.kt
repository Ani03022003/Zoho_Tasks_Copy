package com.example.displaycolors.rvdisplay

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.displaycolors.R
import com.example.displaycolors.databinding.FragmentRecycleViewBinding
import com.example.displaycolors.display.DisplayViewModel

class RecycleViewFragment : Fragment() {
    private lateinit var binding: FragmentRecycleViewBinding
    private lateinit var viewModel: RecycleViewViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_recycle_view,container,false)

        val viewModelFactory = RecycleViewViewModelFactory()

        viewModel = ViewModelProvider(this , viewModelFactory)[RecycleViewViewModel::class.java]

        val args = RecycleViewFragmentArgs.fromBundle(requireArguments())

        val rvAdapter = RecycleViewAdapter(args.colors)

        binding.scrollView.adapter = rvAdapter

        rvAdapter.setOnItemClicker(object  : RecycleViewAdapter.onItemClickListerner {
            override fun onItemClick(color: String) {
                Toast.makeText(context, "The color you clicked is $color", Toast.LENGTH_LONG).show()
            }

        })

        Log.i("RVFragment", "$args")

        return binding.root
    }

}