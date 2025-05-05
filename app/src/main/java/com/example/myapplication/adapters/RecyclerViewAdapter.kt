package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.SearchItemBinding
import com.example.myapplication.models.SearchItem

class RecyclerViewAdapter(val itemList: List<SearchItem>) : RecyclerView.Adapter<RecyclerViewAdapter.Holder>() {

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = SearchItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_item,parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = itemList[position]
        holder.binding.apply {
            searchItemTV.text = item.text
        }
    }

    override fun getItemCount() = itemList.size

}