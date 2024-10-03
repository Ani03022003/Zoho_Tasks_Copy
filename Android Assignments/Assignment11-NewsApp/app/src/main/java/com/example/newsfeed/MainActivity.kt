package com.example.newsfeed

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.newsfeed.databinding.ActivityMainBinding
import com.example.newsfeed.network.WeatherApi
import com.example.newsfeed.network.WeatherData
import com.example.newsfeed.repository.WeatherRepository
import com.google.android.gms.location.LocationServices
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : AppCompatActivity() {

    private var PERMISSION_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION
    private var PERMISSION_REQ_CODE = 1903
    private lateinit var binding : ActivityMainBinding
    private  var data : WeatherData? = null
    private  var savedData: WeatherData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        requestPermissionRuntime()
        binding.enable.setOnClickListener{
            requestPermissionRuntime()
        }

        if (savedInstanceState != null) {
            savedData = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                savedInstanceState.getParcelable("weatherData", WeatherData::class.java)!!
            } else {
                @Suppress("DEPRECATION")
                savedInstanceState.getParcelable("weatherData")!!
            }
        }
    }

    private fun requestPermissionRuntime(){
        when{
            ContextCompat.checkSelfPermission(this,
                PERMISSION_LOCATION) == PackageManager.PERMISSION_GRANTED ->{
                    makeVisible()
                    getUserLocation()
            }
            ActivityCompat.shouldShowRequestPermissionRationale(this,
                PERMISSION_LOCATION) -> {
                val builder : AlertDialog.Builder = AlertDialog.Builder(this)
                builder.setTitle("Permission Required")
                    .setMessage("To show the weather information you must turn on the location.")
                    .setCancelable(false)
                    .setNegativeButton("Cancel"){dialog,_ ->
                        //makeInvisible()
                        dialog.dismiss()
                    }
                    .setPositiveButton("Permit"){dialog,_ ->
                        println("1st")
                        ActivityCompat.requestPermissions(this, arrayOf(PERMISSION_LOCATION), PERMISSION_REQ_CODE)
                        dialog.dismiss()
                    }
                builder.create().show()
            }
            else -> {
                println("2nd")
                ActivityCompat.requestPermissions(this, arrayOf(PERMISSION_LOCATION), PERMISSION_REQ_CODE)
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == PERMISSION_REQ_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getUserLocation()
                makeVisible()
            }
            else if (!ActivityCompat.shouldShowRequestPermissionRationale(this, PERMISSION_LOCATION)) {
                val builder: AlertDialog.Builder = AlertDialog.Builder(this)
                builder.setTitle("Permission Required")
                    .setMessage("To show the weather details you must give location permission to this app. Please give the Permission.")
                    .setCancelable(false)
                    .setNegativeButton("Cancel") { dialog, _ -> dialog.dismiss() }
                    .setPositiveButton("Go to Settings") { dialog, _ ->
                        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                        val uri = Uri.fromParts("package", packageName, null)
                        intent.setData(uri)
                        startActivity(intent)
                        dialog.dismiss()
                    }
                builder.create().show()
            }
            else {
                println("3rd")
                requestPermissionRuntime()
            }
        }
    }

    private fun getUserLocation() {
        //Toast.makeText(this, "Permission is granted", Toast.LENGTH_SHORT).show()
        val locationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        if (ActivityCompat.checkSelfPermission(this, PERMISSION_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(PERMISSION_LOCATION), PERMISSION_REQ_CODE)
            return
        }
        locationProviderClient.lastLocation.addOnSuccessListener { location ->
            if (location != null) {
                println(location)
                val repo = WeatherRepository(location)
                lifecycleScope.launch {
                    data = repo.getWeather()
                    binding.weatherData = data
                }
            }
            else{
                println(savedData.toString())
                data = savedData
                binding.weatherData = data
            }
        }
    }

    private fun makeVisible() {
        println("visible")
        binding.weatherIcon.visibility = View.VISIBLE
        binding.tempAndArea.visibility = View.VISIBLE
        binding.weatherDescription.visibility = View.VISIBLE
        binding.enable.visibility = View.GONE
    }

//    override fun onResume() {
//        super.onResume()
//        println("onResume")
//        requestPermissionRuntime()
//    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if(data != null) {
            println(data.toString())
            outState.putParcelable("weatherData", data)
        }
    }

}
