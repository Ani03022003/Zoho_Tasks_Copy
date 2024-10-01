package com.example.newsfeed.adapter

import android.view.View
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.newsfeed.R

@BindingAdapter("bindImage")
fun bindImage(itemView : ImageView, url: String?){
    if(url.isNullOrEmpty()){
        itemView.setImageResource(R.drawable.ic_broken_image)
    }
    else {
        url.let {
            val uri = url.toUri().buildUpon().scheme("https").build()
            Glide.with(itemView.context)
                .load(uri)
                .apply(
                    RequestOptions()
                        .placeholder(R.drawable.loading_animation)
                        .error(R.drawable.ic_broken_image)
                )
                .into(itemView)
        }
    }
}