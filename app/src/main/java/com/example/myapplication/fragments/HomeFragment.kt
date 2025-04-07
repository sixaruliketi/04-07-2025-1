package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import com.example.myapplication.adapters.ViewPagerAdapter
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.fragmentsForViewPager.FirstFragment
import com.example.myapplication.fragmentsForViewPager.SecondFragment
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val fList = listOf(
        FirstFragment.newInstance(),
        SecondFragment.newInstance()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() = with(binding) {
        if (isAdded){
            val vpAdapter = ViewPagerAdapter(requireActivity(), fList)
            vp.adapter = vpAdapter

            val tList = listOf(
                ContextCompat.getDrawable(requireContext(),R.drawable.ic_home),
                ContextCompat.getDrawable(requireContext(),R.drawable.ic_person)
            )

            TabLayoutMediator(tabLayout,vp) { tab, position ->
                tab.icon = tList[position]
            }.attach()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment()
    }
}