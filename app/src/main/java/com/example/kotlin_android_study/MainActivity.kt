package com.example.kotlin_android_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        var btn = findViewById<Button>(R.id.click)
        btn.setOnClickListener {
            Toast.makeText(this, "click!", Toast.LENGTH_SHORT).show()
        }


    }
}