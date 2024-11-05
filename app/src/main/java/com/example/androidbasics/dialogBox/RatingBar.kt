package com.example.androidbasics.dialogBox

import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.androidbasics.R

class RatingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating_bar)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)

        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            Toast.makeText(this, "Rating: $rating", Toast.LENGTH_SHORT).show()
        }
    }
}