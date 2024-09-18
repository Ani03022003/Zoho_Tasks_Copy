package com.example.displaycolors.rvdisplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.displaycolors.databinding.TextViewBinding


class RecycleViewAdapter(private val colorList: Array<String>) : RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {


    class ViewHolder private constructor(private val binding: TextViewBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(color :String, pos : Int){
            binding.colorText.text = color
            binding.numText.text = pos.toString()
        }

        companion object{
            fun from (parent: ViewGroup) : ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = TextViewBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(view)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun getItemCount(): Int = colorList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(colorList[position], position + 1)
    }

}