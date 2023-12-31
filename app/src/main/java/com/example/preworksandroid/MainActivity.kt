package com.example.preworksandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn: Button = findViewById(R.id.myButton)
        btn.setOnClickListener {
            // Do something here
            Toast.makeText(this, "Hello, nice to meet you too!", Toast.LENGTH_SHORT).show()

        }
    }
}