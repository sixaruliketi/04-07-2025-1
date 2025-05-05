package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.RecyclerViewAdapter
import com.example.myapplication.databinding.FragmentSearchBinding
import com.example.myapplication.models.SearchItem

class SearchFragment : Fragment() {

    lateinit var binding : FragmentSearchBinding
    lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewAdapter = RecyclerViewAdapter(getItem())
        searchRV.adapter = recyclerViewAdapter
        searchRV.layoutManager = GridLayoutManager(requireContext(),3)
    }

    private fun getItem(): List<SearchItem> {
        val list = mutableListOf(
            SearchItem("","text1"),
            SearchItem("","text2"),
            SearchItem("","text3"),
            SearchItem("","text4"),
            SearchItem("","text5"),
            SearchItem("","text6"),
            SearchItem("","text1"),
            SearchItem("","text2"),
            SearchItem("","text3"),
            SearchItem("","text4"),
            SearchItem("","text5"),
            SearchItem("","text6"),
            SearchItem("","text1"),
            SearchItem("","text2"),
            SearchItem("","text3"),
            SearchItem("","text4"),
            SearchItem("","text5"),
            SearchItem("","text6"),
            SearchItem("","text1"),
            SearchItem("","text2"),
            SearchItem("","text3"),
            SearchItem("","text4"),
            SearchItem("","text5"),
            SearchItem("","text6"),
            SearchItem("","text1"),
            SearchItem("","text2"),
            SearchItem("","text3"),
            SearchItem("","text4"),
            SearchItem("","text5"),
            SearchItem("","text6"),
            SearchItem("","text1"),
            SearchItem("","text2"),
            SearchItem("","text3"),
            SearchItem("","text4"),
            SearchItem("","text5"),
            SearchItem("","text6"),
            SearchItem("","text1"),
            SearchItem("","text2"),
            SearchItem("","text3"),
            SearchItem("","text4"),
            SearchItem("","text5"),
            SearchItem("","text6")
        )
        return list
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SearchFragment()
    }
}