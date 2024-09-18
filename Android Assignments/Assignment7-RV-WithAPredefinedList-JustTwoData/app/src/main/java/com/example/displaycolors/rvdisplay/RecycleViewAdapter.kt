package com.example.displaycolors.rvdisplay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.displaycolors.databinding.TextViewBinding


class RecycleViewAdapter(private val colorList: Array<String>) : RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {

    private lateinit var mListener: onItemClickListerner

    class ViewHolder private constructor(private val binding: TextViewBinding, private val listener: onItemClickListerner) : RecyclerView.ViewHolder(binding.root) {

        fun bind(color :String, pos : Int){
            binding.colorText.text = color
            binding.numText.text = pos.toString()
            binding.colorText.setOnClickListener{
                listener.onItemClick(color)
            }
        }

        companion object{
            fun from (parent: ViewGroup, mListener: onItemClickListerner) : ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = TextViewBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(view, mListener)
            }
        }
    }


    interface onItemClickListerner{
        fun onItemClick(color: String)
    }

    fun setOnItemClicker(listener: onItemClickListerner){
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent, mListener)
    }

    override fun getItemCount(): Int = colorList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(colorList[position], position + 1)
    }

}