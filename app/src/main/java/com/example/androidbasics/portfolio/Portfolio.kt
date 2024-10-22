package com.example.androidbasics.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.androidbasics.R

class Portfolio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio)
        setSupportActionBar(findViewById(R.id.portfolioMenubar))
//        val adademicsCardButton = findViewById<ImageButton>(R.id.academicsCard)
//
//        adademicsCardButton.setOnClickListener {
//            val intent = Intent(this, AcademicsPage::class.java)
//            startActivity(intent)
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.portfolio_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.emailItem -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:james.a.garfield@examplepetstore.com"))
                startActivity(intent)
                true
            }
            R.id.contactItem -> {
                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567890"))
                startActivity(intent)
                true
            }
            R.id.feedbackItem -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}