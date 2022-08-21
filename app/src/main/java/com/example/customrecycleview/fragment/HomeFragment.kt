package com.example.customrecycleview.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customrecycleview.Utils.BaseModel
import com.example.customrecycleview.adapters.GenericAdapter
import com.example.customrecycleview.adapters.HomeRecycleViewAdapter
import com.example.customrecycleview.binders.DataBinder
import com.example.customrecycleview.databinding.HomeFragmentBinding
import com.example.customrecycleview.models.Book
import com.example.customrecycleview.models.SaleBanner

class HomeFragment: Fragment() {

    lateinit var binding : HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeFragmentBinding.inflate(layoutInflater)


        binding.recycleView.layoutManager = LinearLayoutManager(context)
        binding.recycleView.adapter = HomeRecycleViewAdapter(getList())

    }


    private fun getList(): ArrayList<BaseModel>{
        return arrayListOf(
            Book("aa"),Book("bb"),
            SaleBanner("cc"),
            Book("dd"), Book("ee"), Book("ff"),
            SaleBanner("gg"), SaleBanner("hh"))
    }

}