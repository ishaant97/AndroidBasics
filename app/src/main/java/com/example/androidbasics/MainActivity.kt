package com.example.androidbasics

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val pizzaAppCard = findViewById<androidx.cardview.widget.CardView>(R.id.pizzaAppCard)
        pizzaAppCard.setOnClickListener {
            val intent = Intent(this, PizzaApp::class.java)
            startActivity(intent)
        }

    }
}