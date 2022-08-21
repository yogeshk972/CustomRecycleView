package com.example.customrecycleview.models

import com.example.customrecycleview.Utils.BaseModel
import com.example.customrecycleview.Utils.Constants

class Book(val title:String ="",val author: String="", val descriptor: String=""): BaseModel() {
    override fun getModelType(): Int {
        return Constants.Book
    }
}