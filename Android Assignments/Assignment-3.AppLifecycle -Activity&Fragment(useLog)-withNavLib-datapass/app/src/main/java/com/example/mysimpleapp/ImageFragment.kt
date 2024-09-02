package com.example.mysimpleapp

import android.content.ActivityNotFoundException
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import com.example.mysimpleapp.databinding.FragmentImageBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 * Use the [ImageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ImageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding=DataBindingUtil.inflate<FragmentImageBinding>(inflater,R.layout.fragment_image,container,false)
        Timber.i("In ImageFragment")
        val arg = ImageFragmentArgs.fromBundle(requireArguments())
        binding.imageView.setImageResource(arg.dogImageId)
        setHasOptionsMenu(true)
    return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.share_menu,menu)
    }

    private fun share(){
        val shareIntent = ShareCompat.IntentBuilder.from(requireActivity())
            .setText("This ia Dog")
            .setType("text/plain")
            .intent

        try{
            startActivity(shareIntent)
        }catch (ex: ActivityNotFoundException) {
            Toast.makeText(context, "Can't share",Toast.LENGTH_LONG).show()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.share_menu -> share()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.i("onCreate called")
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        Timber.i("onAttach called")
        super.onAttach(context)
    }

    override fun onStart() {
        Timber.i("onStart called")
        super.onStart()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Timber.i("onActivityCreated called")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onResume() {
        Timber.i("onResume called")
        super.onResume()
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