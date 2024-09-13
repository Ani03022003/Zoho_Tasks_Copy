package com.example.databaseapplication.information

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.navigation.fragment.findNavController
import androidx.room.Database
import com.example.databaseapplication.R
import com.example.databaseapplication.database.Information
import com.example.databaseapplication.database.InformationDatabase
import com.example.databaseapplication.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var binding : FragmentInfoBinding
    private lateinit var viewModel: InfoViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_info, container, false)

        val application = requireNotNull(this.activity).application

        val datasource = InformationDatabase.getInstance(application).informationDatabaseDao()

        val viewModelFactory = InfoViewModelFactory(datasource, application)

        viewModel = ViewModelProvider(this, viewModelFactory)[InfoViewModel::class.java]

        binding.infoViewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.onNull.observe(viewLifecycleOwner, Observer { Null ->
            if(Null){
                val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
                builder.setMessage("Please fill all the details").setTitle("Empty Values").setPositiveButton("OK"){
                    dialog,_ -> dialog.dismiss()
                }
                val dialog: AlertDialog = builder.create()
                dialog.show()
                viewModel.onNullFinished()
            }
        })

        viewModel.navigateToDisplay.observe(viewLifecycleOwner, Observer { display ->
            if(display){
                findNavController().navigate(InfoFragmentDirections.actionInfoFragmentToDisplayFragment2())
                viewModel.onNavigationFinish()
            }
        })

        return binding.root
    }

    override fun onStop() {
        super.onStop()
        viewModel.clearText()
    }
}