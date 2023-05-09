package com.example.kotlin_android_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class ViewStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_study2)

        var spinner = findViewById<Spinner>(R.id.my_spinner)
        val menuItems = arrayOf("Item 1", "Item 2", "Item 3")
        val adapter: ArrayAdapter<String?> = ArrayAdapter<String?>(
            this,
            android.R.layout.simple_spinner_item,
            menuItems
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // spinner.setAdapter(adapter)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override  fun onItemSelected(p0: AdapterView<*>?, p1: View?, poisition: Int, id: Long){
                val selectedItem = p0?.getItemAtPosition(poisition).toString()
                Log.d("mytag", selectedItem)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
    }
}