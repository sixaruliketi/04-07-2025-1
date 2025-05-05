package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.RecyclerViewAdapter
import com.example.myapplication.adapters.RecyclerViewListAdapter
import com.example.myapplication.databinding.FragmentProfileBinding
import com.example.myapplication.models.ProfileItem
import com.example.myapplication.models.SearchItem

class ProfileFragment : Fragment() {

    lateinit var binding : FragmentProfileBinding
    lateinit var horizontalRV : RecyclerViewAdapter // classic for horizontal
    lateinit var verticalRV : RecyclerViewListAdapter // listAdapter for vertical

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding){
        super.onViewCreated(view, savedInstanceState)

        //top RecyclerView (horizontal)

        horizontalRV = RecyclerViewAdapter(getItem())
        profileRecyclerViewHorizontal.adapter = horizontalRV
        profileRecyclerViewHorizontal.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)


        //bottom recyclerView (Vertical)

        verticalRV = RecyclerViewListAdapter()
        profileRecyclerViewVertical.adapter = verticalRV
        profileRecyclerViewVertical.layoutManager = LinearLayoutManager(requireContext())
        val profileItemList = listOf(
            ProfileItem("","title1","details for this post"),
            ProfileItem("","title2"," details for this post details for this post"),
            ProfileItem("","title3","details for this post details for this post"),
            ProfileItem("","title4","details for this post details for this post"),
            ProfileItem("","title5","details for this post"),
            ProfileItem("","title6","details for this post"),
            ProfileItem("","title7","details for this post details for this post"),
            ProfileItem("","title8","details for this post", "2025/05/05"),
            ProfileItem("","title9","details for this post", "2025/04/05 23:20"),
            ProfileItem("","title1","details for this post"),
            ProfileItem("","title2"," details for this post details for this post"),
            ProfileItem("","title3","details for this post details for this post"),
            ProfileItem("","title4","details for this post details for this post"),
            ProfileItem("","title5","details for this post"),
            ProfileItem("","title6","details for this post"),
            ProfileItem("","title7","details for this post details for this post"),
            ProfileItem("","title8","details for this post", "2025/05/05"),
            ProfileItem("","title9","details for this post", "2025/04/05 23:20"),
            ProfileItem("","title1","details for this post"),
            ProfileItem("","title2"," details for this post details for this post"),
            ProfileItem("","title3","details for this post details for this post"),
            ProfileItem("","title4","details for this post details for this post"),
            ProfileItem("","title5","details for this post"),
            ProfileItem("","title6","details for this post"),
            ProfileItem("","title7","details for this post details for this post"),
            ProfileItem("","title8","details for this post", "2025/05/05"),
            ProfileItem("","title9","details for this post", "2025/04/05 23:20")
        )
        verticalRV.submitList(profileItemList)


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
            ProfileFragment()
    }
}