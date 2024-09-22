package com.example.anime

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.anime.network.AnimeProperty
import com.example.anime.textdisplay.ApiStatus
import retrofit2.http.Url

@BindingAdapter("AnimeImage")
fun bindImage(itemView: ImageView, url: String?){
    url?.let {
        val uri = url.toUri().buildUpon().scheme("https").build()
        Glide.with(itemView.context)
            .load(uri)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.loading_animation)
                    .error(R.drawable.ic_broken_image))
            .into(itemView)
    } ?: run {
        itemView.setImageResource(R.drawable.ic_broken_image)
    }

}

@BindingAdapter("AnimeApiStatus")
fun bindStatus(itemView: ImageView, status: ApiStatus?){
    when(status){
        ApiStatus.ERROR -> {
            itemView.visibility = View.VISIBLE
            itemView.setImageResource(R.drawable.loading_animation)
            itemView.visibility = View.GONE
        }
        ApiStatus.LOADING -> {
            itemView.visibility = View.VISIBLE
            itemView.setImageResource(R.drawable.loading_animation)
        }
        ApiStatus.DONE -> {
            itemView.visibility = View.GONE
        }
        ApiStatus.START -> {
            itemView.visibility = View.GONE
        }
        ApiStatus.FINISH -> {
            itemView.visibility = View.GONE
        }
        null -> {
            itemView.visibility = View.GONE
        }
    }
}