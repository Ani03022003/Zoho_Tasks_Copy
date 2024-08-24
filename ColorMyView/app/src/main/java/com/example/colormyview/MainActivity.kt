package com.example.colormyview

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil
import com.example.colormyview.databinding.ActivityMainBinding
import com.example.colormyview.ui.theme.ColorMyViewTheme

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        //binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setColorOnClick()

    }

    private fun setColorOnClick() {
        val colorBox: List<View> = listOf(
            binding.boxOne,
            binding.boxTwo,
            binding.boxThree,
            binding.boxFour,
            binding.boxFive,
            binding.root,
            binding.redButton,
            binding.yellowButton,
            binding.greenButton
        )

        for(item in colorBox){
            item.setOnClickListener{
                it.invalidate()
                makeColored(it)
            }
        }
    }

    private fun makeColored(it: View?) {
        when(it){
            // Boxes using Color class colors for background
            binding.boxOne -> it.setBackgroundColor(Color.DKGRAY)
            binding.boxTwo -> it.setBackgroundColor(Color.GRAY)

//            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
//            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            binding.boxThree -> it.setBackgroundResource(android.R.color.holo_green_light)
            binding.boxFive -> it.setBackgroundResource(android.R.color.holo_green_dark)
            binding.boxFour -> it.setBackgroundResource(android.R.color.holo_green_light)

//            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
//            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
//            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            binding.redButton -> binding.boxThree.setBackgroundResource(R.color.red)
            binding.yellowButton -> binding.boxFour.setBackgroundResource(R.color.yellow)
            binding.greenButton -> binding.boxFive.setBackgroundResource(R.color.green)

            else -> it?.setBackgroundColor(Color.WHITE)
//            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            statusBar()
        }
    }

    private fun statusBar() {
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                )
        actionBar?.hide()
    }
}