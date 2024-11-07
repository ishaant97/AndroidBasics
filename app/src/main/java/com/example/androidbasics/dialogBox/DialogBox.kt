package com.example.androidbasics.dialogBox

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
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
        val subscribeButton = findViewById<Button>(R.id.subscribeButton)
        val languageButton = findViewById<Button>(R.id.languagesButton)


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

        subscribeButton.setOnClickListener {
            // here we will write the code for custom dialog box
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            val b = LayoutInflater.from(this).inflate(R.layout.custom_dialog_box, null)
            val dialog = AlertDialog.Builder(this).setView(b)
            dialog.setPositiveButton("Subscribe") {dialog, _ ->
                val editTextButton = b.findViewById<EditText>(R.id.editText)
                val email = editTextButton.text.toString()
                if(email.isNotBlank()){
                    Toast.makeText(this, "Subscribed to $email", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
                }
                dialog.dismiss()
            }
            dialog.setNegativeButton("Cancel") {dialog, _ -> dialog.dismiss()}
            dialog.create().show()
        }

        languageButton.setOnClickListener {
            //custom dialog box
            val b = LayoutInflater.from(this).inflate(R.layout.languages_custom_dialog_box, null)
            val dialog = AlertDialog.Builder(this).setView(b)

            val languagesListView = b.findViewById<ListView>(R.id.languagesListView)

            val items = listOf("English", "French", "Spanish", "German")

            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
            languagesListView.adapter = adapter

            languagesListView.setOnItemClickListener { _, _, position, _ ->
                val selectedItem = items[position]
                Toast.makeText(this, "Selected language: $selectedItem", Toast.LENGTH_LONG).show()
            }
            dialog.create().show()
        }
    }
}