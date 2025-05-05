package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ProfileItemBinding
import com.example.myapplication.models.ProfileItem

class RecyclerViewListAdapter : ListAdapter<ProfileItem, RecyclerViewListAdapter.MyViewHolder>(Comparator()) {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ProfileItemBinding.bind(itemView)
        fun bind(item: ProfileItem) = with(binding) {
            textView1.text = item.title
            textView2.text = item.details
            textView3.text = item.time
        }
    }

    class Comparator() : DiffUtil.ItemCallback<ProfileItem>() {
        override fun areItemsTheSame(oldItem: ProfileItem, newItem: ProfileItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ProfileItem, newItem: ProfileItem): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}