package com.example.harrypotter.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.harrypotter.R
import com.example.harrypotter.databinding.FragmentChooseBinding

class ChooseFragment : Fragment() {
    private lateinit var binding : FragmentChooseBinding
    private lateinit var requestItem : String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_choose,container,false)

        val spinner = binding.requestText

        ArrayAdapter.createFromResource(requireContext(), R.array.get_requests, android.R.layout.simple_spinner_item)
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
            }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                requestItem = parent?.getItemAtPosition(position).toString()
                Toast.makeText(context, "Selected item $requestItem", Toast.LENGTH_LONG).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        binding.okButton.setOnClickListener{
            findNavController().navigate(ChooseFragmentDirections.actionChooseFragmentToDisplayFragment(requestItem))
        }
        return binding.root
    }

}