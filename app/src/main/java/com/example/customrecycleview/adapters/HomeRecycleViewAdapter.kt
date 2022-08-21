package com.example.customrecycleview.adapters

import com.example.customrecycleview.Utils.BaseModel
import com.example.customrecycleview.Utils.Constants
import com.example.customrecycleview.binders.BookBinder
import com.example.customrecycleview.binders.SaleBannerBinder

class HomeRecycleViewAdapter(data: List<BaseModel>): GenericAdapter(data) {
    init {
        addBinder(Constants.Book, BookBinder(this))
        addBinder(Constants.SaleBanner, SaleBannerBinder(this))
    }
}