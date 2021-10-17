package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    //lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.b1)
       // button2 = findViewById(R.id.b2)

        button1.setOnClickListener {
            Toast.makeText(this, "set on click listener in MainActivity", Toast.LENGTH_SHORT).show()
        }
    }
    fun secondButton(view:View) {
        Toast.makeText(this, "SecondButton", Toast.LENGTH_SHORT).show()
    }
}