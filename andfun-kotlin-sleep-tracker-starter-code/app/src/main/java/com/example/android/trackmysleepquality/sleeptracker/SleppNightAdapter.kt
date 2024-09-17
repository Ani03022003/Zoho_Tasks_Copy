package com.example.android.trackmysleepquality.sleeptracker

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightAdapter : RecyclerView.Adapter<SleepNightAdapter.TextItemViewHolder>() {

    class TextItemViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val textView : TextView

        init {
            textView = view.findViewById(R.id.text_view)
        }
    }

    private val data = mutableListOf<SleepNight>()

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(
        holder: TextItemViewHolder,
        position: Int
    ) {
        val item = data[position]

        holder.textView.text = item.sleepQuality.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
        
    }
}