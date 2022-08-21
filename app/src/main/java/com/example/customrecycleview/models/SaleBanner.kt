package com.example.customrecycleview.models

import com.example.customrecycleview.Utils.BaseModel
import com.example.customrecycleview.Utils.Constants

class SaleBanner(val desc: String): BaseModel() {
    override fun getModelType(): Int {
        return Constants.SaleBanner
    }
}