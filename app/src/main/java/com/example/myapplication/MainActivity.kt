package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var iv1: ImageView
    lateinit var iv2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv1 = findViewById(R.id.iv1)
        iv2 = findViewById(R.id.iv2)

        animateView(iv1, 1000, 3000)
        animateView(iv2, 3000, 5000)
    }

    fun animateView(view: View, duration: Long, delay: Long) {
        Handler().postDelayed(Runnable {
            view.animate().alpha(1f).setDuration(duration)
        }, delay)
    }
}