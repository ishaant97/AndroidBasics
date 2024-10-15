package com.example.androidbasics

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CA1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca1)
        val signInButton = findViewById<Button>(R.id.SignInbutton)
        signInButton.setOnClickListener {
            Toast.makeText(this, "Welcome Back", Toast.LENGTH_SHORT).show()
        }
    }
}