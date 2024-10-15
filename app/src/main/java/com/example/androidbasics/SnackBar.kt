package com.example.androidbasics

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class SnackBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)
        val snackBarButton = findViewById<Button>(R.id.snackBarButton)
        snackBarButton.setOnClickListener{ view ->
            Snackbar.make(view, "This is a SnackBar", Snackbar.LENGTH_LONG).setAction("UNDO"){
                Toast.makeText(this, "This is a Toast", Toast.LENGTH_LONG).show()
            }.show()
        }
    }
}