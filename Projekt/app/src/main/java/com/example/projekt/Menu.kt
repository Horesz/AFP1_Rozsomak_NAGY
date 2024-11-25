package com.example.projekt

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var button2 : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.buttonExit)
        button.setOnClickListener(View.OnClickListener{
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        button2.setOnClickListener(View.OnClickListener{
            finish()
        })
    }
}