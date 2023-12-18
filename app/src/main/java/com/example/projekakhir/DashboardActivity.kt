package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import android.content.Intent

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val cardView1= findViewById<androidx.cardview.widget.CardView>(R.id.cdKat1)

        cardView1.setOnClickListener {
            val intent = Intent(this, HijauActivity::class.java)
            startActivity(intent)
        }
        val cardView2= findViewById<androidx.cardview.widget.CardView>(R.id.cdkat2)

        cardView2.setOnClickListener {
            val intent = Intent(this, BuahActivity::class.java)
            startActivity(intent)
        }

        val cardView3= findViewById<androidx.cardview.widget.CardView>(R.id.cdkat3)

        cardView3.setOnClickListener {
            val intent = Intent(this, CabeActivity::class.java)
            startActivity(intent)
        }

        val cardView4= findViewById<androidx.cardview.widget.CardView>(R.id.cdkat4)

        cardView4.setOnClickListener {
            val intent = Intent(this, UmbiActivity::class.java)
            startActivity(intent)
            }
    }
}