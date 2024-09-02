package com.example.mysimpleapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.ui.text.toLowerCase
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mysimpleapp.databinding.FragmentMainBinding
import timber.log.Timber
import java.util.Locale

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    data class DogImage(val dogImage: Int)

    private val images:MutableList<DogImage> = mutableListOf(
        DogImage(R.drawable.roshan),
        DogImage(R.drawable.jackie),
        DogImage(R.drawable.luffy),
        DogImage(R.drawable.toshi)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        Timber.i("In MainFragment")
        binding.doneButton.setOnClickListener {
            view : View ->
            val editText = binding.simpleText.text.toString().lowercase(Locale.ROOT)
            when(editText){
            "roshan" -> view.findNavController().navigate(MainFragmentDirections.actionMainFragmentToImageFragment(images[0].dogImage))
            "jackie" -> view.findNavController().navigate(MainFragmentDirections.actionMainFragmentToImageFragment(images[1].dogImage))
            "luffy" -> view.findNavController().navigate(MainFragmentDirections.actionMainFragmentToImageFragment(images[2].dogImage))
            "toshi" -> view.findNavController().navigate(MainFragmentDirections.actionMainFragmentToImageFragment(images[3].dogImage))
            else -> Toast.makeText(context,"Dog name not found",Toast.LENGTH_SHORT).show()
            }

        }

        return binding.root
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.i("onCreate called")
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        Timber.i("onAttach called")
        super.onAttach(context)
    }

    override fun onResume() {
        Timber.i("onResume called")
        super.onResume()
    }

    override fun onStart() {
        Timber.i("onStart called")
        super.onStart()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Timber.i("onActivityCreated called")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onPause() {
        Timber.i("onPause called")
        super.onPause()
    }

    override fun onStop() {
        Timber.i("onStop called")
        super.onStop()
    }

    override fun onDestroyView() {
        Timber.i("onDestroyView called")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Timber.i("onDestroy called")
        super.onDestroy()
    }

    override fun onDetach() {
        Timber.i("onDetach called")
        super.onDetach()
    }

}