package com.example.harrypotter.display

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.harrypotter.R
class DisplayFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val args = DisplayFragmentArgs.fromBundle(requireArguments()).request

        Toast.makeText(context, args, Toast.LENGTH_LONG).show()

        return inflater.inflate(R.layout.fragment_display, container, false)
    }
}