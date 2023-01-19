package com.example.customrecycleview.binders

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecycleview.adapters.GenericAdapter

abstract class DataBinder<V> where V: RecyclerView.ViewHolder{

    abstract fun newViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder

    abstract fun bindViewHolder(holder: V, position: Int)

}