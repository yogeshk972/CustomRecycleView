package com.example.customrecycleview.binders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecycleview.R
import com.example.customrecycleview.adapters.GenericAdapter
import com.example.customrecycleview.models.SaleBanner

class SaleBannerBinder(private val adapter: GenericAdapter): DataBinder<SaleBannerBinder.ViewHolder>() {

    override fun newViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_card, parent, false)
        return ViewHolder(view)
    }

    override fun bindViewHolder(holder: ViewHolder, position: Int) {
        val data = adapter.getData(position) as SaleBanner
        holder.textView.text = data.desc
        holder.itemView.setBackgroundColor( ContextCompat.getColor(holder.itemView.context, R.color.purple_200) )
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.textView)
    }

}