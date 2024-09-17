package com.example.displaycolors.rvdisplay

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class RecycleViewAdapter(private val colorList: Array<String>) : RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = colorList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}