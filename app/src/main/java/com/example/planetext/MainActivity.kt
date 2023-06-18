package com.example.planetext

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textField: EditText = findViewById<EditText>(R.id.textInputField)
        val button =  findViewById<ImageButton>(R.id.displayBtn)

        button?.setOnClickListener {
            val text = textField.text.toString()
            if (text.isNotBlank()) {
                // makes the text string go to BannerActivity
                val intent = Intent(this, BannerActivity::class.java)
                intent.putExtra("banner_text", text)
                startActivity(intent)
            }
        }
    }
}