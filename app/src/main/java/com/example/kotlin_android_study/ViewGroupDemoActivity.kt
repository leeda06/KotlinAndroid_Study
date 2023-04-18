package com.example.kotlin_android_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ViewGroupDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout_demo)
        supportActionBar?.hide()
    }
}