package com.example.projekakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick1: Button = findViewById(R.id.btn1)
        btnClick1.setOnClickListener(this)
        val btnClick2: Button = findViewById(R.id.btn2)
        btnClick2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btn1 -> {
                    val pindahIntent = Intent(this, LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.btn2 -> {
                    val pindahIntent = Intent(this, RegisterActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}




