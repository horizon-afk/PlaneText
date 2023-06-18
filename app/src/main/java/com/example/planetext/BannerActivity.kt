package com.example.planetext

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets.*
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class BannerActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        // hides the bottom navigation bars
        window.decorView.windowInsetsController!!.hide(
            Type.navigationBars()
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner)

        val banner = findViewById<TextView>(R.id.banner)
        val text = intent.getStringExtra("banner_text")
        banner.text = text


    }
}