package com.example.customrecycleview.binders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecycleview.R
import com.example.customrecycleview.adapters.GenericAdapter
import com.example.customrecycleview.models.Book

class BookBinder(val adapter: GenericAdapter): DataBinder<BookBinder.BookViewHolder>() {
    override fun newViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view=  LayoutInflater.from(parent.context).inflate(R.layout.my_card, parent, false)
        return BookViewHolder(view)
    }

    override fun bindViewHolder(holder: BookViewHolder, position: Int) {
        val book= adapter.getData(position) as Book
        holder.textView.text = book.title
    }

    class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.textView)
    }

}