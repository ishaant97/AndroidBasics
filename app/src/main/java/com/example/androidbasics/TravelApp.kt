package com.example.androidbasics

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class TravelApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_app)
        val destinationSpinner : Spinner = findViewById(R.id.spinner)
        val packageListView : ListView = findViewById(R.id.listView)
        val destinations = arrayOf("Paris", "New York", "Tokyo")
        val packageForParis = arrayOf("Eiffel Tower", "Louvre Museum", "Arc de Triomphe")
        val packageForNewYork = arrayOf("Statue of Liberty", "Empire State Building", "Brooklyn Bridge")
        val packageForTokyo = arrayOf("Tokyo Tower", "Shibuya Crossing", "Akihabara")

        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, destinations)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        destinationSpinner.adapter = spinnerAdapter

        val initialAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,packageForParis)
        packageListView.adapter = initialAdapter

//        destinationSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>, view : View?, position: Int, id: Long) {
//                val selectedPackages = when(position) {
//                    0 -> packageForParis
//                    1 -> packageForNewYork
//                    else -> packageForTokyo
//                }
//                val listAdapter = ArrayAdapter(this@TravelApp,android.R.layout.simple_list_item_1,selectedPackages)
//                packageListView.adapter = listAdapter
//
//            }
//        }

//        val listAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,selectedPackages)
//        packageListView.adapter = listAdapter

    }
}