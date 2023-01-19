package com.example.customrecycleview.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecycleview.Utils.BaseModel
import com.example.customrecycleview.binders.DataBinder

open class GenericAdapter(private val data: List<BaseModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var binders = mutableMapOf<Int, DataBinder<*>>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return getBinder<DataBinder<*>>(viewType).newViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        getBinder<DataBinder<RecyclerView.ViewHolder>>( getItemViewType(position) ).bindViewHolder(holder, position)
    }

    private fun <D: DataBinder<*>> getBinder(viewType: Int): D {
        return binders[viewType]!! as D
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].getModelType()
    }

    fun  <D: DataBinder<*>> addBinder(type:Int, binder: D){
        binders[type] = binder
    }

    fun getData(position: Int): BaseModel{
        return data[position]
    }

}