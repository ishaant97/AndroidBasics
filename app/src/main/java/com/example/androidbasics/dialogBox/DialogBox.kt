package com.example.androidbasics.dialogBox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.androidbasics.R

class DialogBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dialog_box)
        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            val b = AlertDialog.Builder(this)
            b.setTitle("Give Rating")
            b.setMessage("Are you sure you want to give rating?")
            b.setCancelable(false)
            b.setPositiveButton("Yes") {_, _ ->
                val intent = Intent(this, RatingBar::class.java)
                startActivity(intent)
            }
            b.setNegativeButton("No") {dialog,_ -> dialog.cancel()}
            b.setNeutralButton("MaybeLater"){_,_ -> Toast.makeText(this, "You will be reminded after 3 days", Toast.LENGTH_SHORT).show()}
            val dialog = b.create()
            dialog.show()
        }
    }

}