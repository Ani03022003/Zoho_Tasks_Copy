package com.example.pricecalculatorlayout

import android.os.Bundle
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
import com.example.pricecalculatorlayout.databinding.ActivityNameBinding
import com.example.pricecalculatorlayout.ui.theme.PriceCalculatorLayoutTheme

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityNameBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}