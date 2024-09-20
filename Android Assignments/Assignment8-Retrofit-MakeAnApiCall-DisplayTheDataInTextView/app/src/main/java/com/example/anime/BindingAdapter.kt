package com.example.anime

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.anime.network.AnimeProperty
import com.example.anime.textdisplay.ApiStatus

@BindingAdapter("AnimeApiStatus")
fun bindStatus(itemView: ImageView, status: ApiStatus?){
    when(status){
        ApiStatus.ERROR -> {
            itemView.visibility = View.VISIBLE
            itemView.setImageResource(R.drawable.ic_connection_error)
        }
        ApiStatus.LOADING -> {
            itemView.visibility = View.VISIBLE
            itemView.setImageResource(R.drawable.loading_animation)
        }
        ApiStatus.DONE -> {
            itemView.visibility = View.GONE
        }
        null -> {
            itemView.visibility = View.GONE
        }
    }
}