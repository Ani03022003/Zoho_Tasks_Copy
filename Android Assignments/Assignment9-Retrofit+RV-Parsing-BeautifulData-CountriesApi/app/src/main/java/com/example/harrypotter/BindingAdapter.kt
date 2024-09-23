package com.example.harrypotter

import android.view.View
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.harrypotter.display.ApiStatus
import com.example.harrypotter.display.DisplayAdapter
import com.example.harrypotter.network.DataItem

@BindingAdapter("imageUrl")
fun toImageUrl(itemView : ImageView, url : String?) {
    url?.let {
        val uri = url.toUri().buildUpon().scheme("https").build()
        Glide.with(itemView.context)
            .load(uri)
            .apply(
                RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_broken_image))
            .into(itemView)
    }
}

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data : List<DataItem>? ){
    val adapter = recyclerView.adapter as DisplayAdapter
    adapter.submitList(data)
}

@BindingAdapter("marsApiStatus")
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