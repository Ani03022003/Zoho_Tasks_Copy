package com.example.anime.textdisplay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.anime.R
import com.example.anime.databinding.FragmentJsonBinding

class JsonFragment : Fragment() {
    private lateinit var binding : FragmentJsonBinding
    private lateinit var viewModel: JsonViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_json,container,false)

        val application = requireNotNull(activity).application

        val viewModelFactory = JsonViewModelFactory(application)

        viewModel = ViewModelProvider(this, viewModelFactory)[JsonViewModel::class.java]

        binding.viewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.status.observe(viewLifecycleOwner , Observer {
            when(it) {
                ApiStatus.DONE -> {
                    findNavController().navigate(
                        JsonFragmentDirections.actionJsonFragmentToImageFragment(
                            viewModel.anime.value
                        )
                    )
                }

                ApiStatus.ERROR -> {
                    val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
                    builder.setMessage("Please click the generate button")
                        .setTitle("Json Not Generated").setPositiveButton("OK") { dialog, _ ->
                        dialog.dismiss()
                    }
                    val dialog: AlertDialog = builder.create()
                    dialog.show()
                }

                ApiStatus.START -> Toast.makeText(context,"Starting!",Toast.LENGTH_SHORT).show()

                ApiStatus.LOADING -> Toast.makeText(context, "Loading", Toast.LENGTH_SHORT).show()

                ApiStatus.FINISH -> Toast.makeText(context, "Loading Finished", Toast.LENGTH_SHORT).show()
            }
        })

        return binding.root
    }

    override fun onStop() {
        super.onStop()
        viewModel.doneNavigating()
        viewModel.clearJson()
    }
}