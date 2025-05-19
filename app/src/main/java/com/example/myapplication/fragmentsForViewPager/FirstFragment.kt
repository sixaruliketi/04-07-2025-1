package com.example.myapplication.fragmentsForViewPager

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransitionImpl
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.FirstRecyclerViewAdapter
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.models.FirstItem
import com.example.myapplication.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    private lateinit var adapter: FirstRecyclerViewAdapter

    private val firstList = mutableListOf<FirstItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FirstRecyclerViewAdapter(firstList)

        FirstRecyclerView.adapter = adapter
        FirstRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        fetchPost()

    }

    private fun fetchPost() {

        RetrofitInstance.api.getPosts().enqueue(object : Callback<List<FirstItem>> {
            override fun onResponse(
                call: Call<List<FirstItem>>,
                response: Response<List<FirstItem>>
            ) {
                if (response.isSuccessful) {

                    val posts = response.body()
                    if (posts != null) {
                        Toast.makeText(requireContext(), "posts fetching", Toast.LENGTH_SHORT).show()
                        firstList.clear()
                        firstList.addAll(posts)
                        adapter.notifyDataSetChanged()

                    }

                } else {
                    Toast.makeText(
                        requireContext(),
                        "Error: ${response.code()}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onFailure(call: Call<List<FirstItem>>, t: Throwable) {
                Toast.makeText(requireContext(), "failed: ${t.message}", Toast.LENGTH_SHORT).show()
            }

        })

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            FirstFragment()
    }
}