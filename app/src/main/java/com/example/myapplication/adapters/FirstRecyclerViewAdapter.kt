package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.FirstItemBinding
import com.example.myapplication.models.FirstItem

class FirstRecyclerViewAdapter(private val firstList: List<FirstItem>) : RecyclerView.Adapter<FirstRecyclerViewAdapter.FirstViewHolder>() {

    inner class FirstViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView){

        val binding = FirstItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.first_item,parent,false)
        return FirstViewHolder(view)
    }

    override fun getItemCount() = firstList.size

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.binding.apply {
            val first = firstList[position]

            id.text = first.id.toString()
            title.text = first.title
            body.text = first.body

        }
    }
}