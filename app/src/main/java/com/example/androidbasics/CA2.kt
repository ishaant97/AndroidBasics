package com.example.androidbasics

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CA2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca2)
        setSupportActionBar(findViewById(R.id.ca2menubar))


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ca2menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.hindiLanguage -> {
                Toast.makeText(this,"Hindi Language was pressed", Toast.LENGTH_LONG).show()
                true
            }
            R.id.englishLanguage -> {
                Toast.makeText(this,"English Language was pressed", Toast.LENGTH_LONG).show()

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}