package com.example.dogpics.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.dogpics.databinding.DogImageBinding
import com.example.dogpics.domain.DogDomain

class DisplayAdapter : RecyclerView.Adapter<DisplayAdapter.DogViewHolder>() {

    var data : List<DogDomain> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class DogViewHolder(private val binding: DogImageBinding) : ViewHolder(binding.root){

        fun bind(item: DogDomain){
            binding.dogImage = item
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup) : DogViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = DogImageBinding.inflate(layoutInflater, parent, false)
                return DogViewHolder(view)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        return DogViewHolder.from(parent)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

}