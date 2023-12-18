package com.example.projekakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnClick1: Button = findViewById(R.id.R_btn1)
        btnClick1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.R_btn1 -> {
                    val pindahIntent = Intent(this, LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}