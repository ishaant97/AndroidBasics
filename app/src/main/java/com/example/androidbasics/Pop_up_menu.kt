package com.example.androidbasics

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pop_up_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pop_up_menu)
        val popUpMenuButton = findViewById<Button>(R.id.pop_up_menu)

        popUpMenuButton.setOnClickListener {
            val popupMenu = androidx.appcompat.widget.PopupMenu(this, popUpMenuButton)
            popupMenu.menuInflater.inflate(R.menu.pop_up_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { menuItem ->
                when(menuItem.itemId) {
                    R.id.shareItem -> {
                        // Handle share item click
                        Toast.makeText(this,"Share Clicked",Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.profileItem -> {
                        // Handle profile item
                        Toast.makeText(this,"Profile Clicked",Toast.LENGTH_LONG).show()
                        true
                    }
                    else -> false
                }
            }
            popupMenu.show()
        }
    }
}