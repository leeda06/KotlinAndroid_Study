package com.example.kotlin_android_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LifecycleDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_demo)
    }
    override fun onStart(){
        super.onStart()
        Log.d("mytag", "onStart")
    }
    override fun onResume(){
        super.onResume()
        Log.d("mytag", "onResume")
    }
    override fun onPause(){
        super.onPause()
        Log.d("mytag", "onPause")
    }
    override fun onStop(){
        super.onStop()
        Log.d("mytag", "onStop")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("mytag", "onDestroy")
    }
    override fun onRestart(){
        super.onRestart()
        Log.d("mytag", "onRestart")
    }

}