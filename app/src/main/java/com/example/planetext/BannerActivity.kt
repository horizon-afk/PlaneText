package com.example.planetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BannerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner)

        val banner = findViewById<TextView>(R.id.banner)
        val text = intent.getStringExtra("banner_text")
        banner.text = text


    }
}