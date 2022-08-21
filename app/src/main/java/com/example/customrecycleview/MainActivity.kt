package com.example.customrecycleview

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.customrecycleview.fragment.HomeFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frame = findViewById<FrameLayout>(R.id.frame)
        val homeFragment = HomeFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame, homeFragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}