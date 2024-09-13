package com.example.databaseapplication.display

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databaseapplication.R
import com.example.databaseapplication.database.InformationDatabase
import com.example.databaseapplication.databinding.FragmentDisplayBinding
import com.example.databaseapplication.databinding.FragmentInfoBinding

class DisplayFragment : Fragment() {

    private lateinit var binding : FragmentDisplayBinding

    private lateinit var viewModel: DisplayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_display, container, false)

        val application = requireNotNull(this.activity).application

        val datasource = InformationDatabase.getInstance(application).informationDatabaseDao()

        val viewModelFactory = DisplayViewModelFactory(datasource, application)

        viewModel = ViewModelProvider(this, viewModelFactory)[DisplayViewModel::class.java]

        binding.displayViewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }

}