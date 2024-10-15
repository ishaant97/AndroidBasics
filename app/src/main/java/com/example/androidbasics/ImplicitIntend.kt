package com.example.androidbasics

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class ImplicitIntend : AppCompatActivity() {

    lateinit var timeView: TextView
    val handler = Handler(Looper.getMainLooper())
    val runnable = object : Runnable {
            override fun run() {
            updateTime()
            handler.postDelayed(this, 1000)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intend)
        val constactCard = findViewById<androidx.cardview.widget.CardView>(R.id.contacts)
//        val cameraButton = findViewById<Button>(R.id.camera)
//        val callLogButton = findViewById<Button>(R.id.callLog)
//        val browserButton = findViewById<Button>(R.id.browser)

        constactCard.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"))
            startActivity(intent)
        }

        timeView = findViewById(R.id.timeView)
        handler.post(runnable)
    }


    fun updateTime() {
        val currentTime = Calendar.getInstance().time
        val dateFormat = SimpleDateFormat("HHmm", Locale.getDefault())
        val formattedTime = dateFormat.format(currentTime)

        timeView.text = formattedTime
    }
}