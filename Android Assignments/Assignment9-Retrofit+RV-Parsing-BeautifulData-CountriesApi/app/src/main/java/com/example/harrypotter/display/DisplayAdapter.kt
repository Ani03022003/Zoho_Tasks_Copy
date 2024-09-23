package com.example.harrypotter.display

import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.harrypotter.databinding.ContentLayoutBinding
import com.example.harrypotter.databinding.FragmentDisplayBinding
import com.example.harrypotter.network.DataItem

class DisplayAdapter(private val data : List<DataItem?>) : ListAdapter<DataItem, DisplayAdapter.ViewHolder>(DataDiffUtil()) {

    class DataDiffUtil : DiffUtil.ItemCallback<DataItem>(){
        override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
            return newItem.id == oldItem.id
        }

    }

    class ViewHolder(private val binding: ContentLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: DataItem?) {
            binding.dataItem = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = ContentLayoutBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(view)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    //override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }
}