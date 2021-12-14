package com.example.googlepageproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.googlepageproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var faisal:ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        faisal = ActivityMainBinding.inflate(layoutInflater)
        faisal.root
        faisal.button.setOnClickListener {

            Toast.makeText(this, "thank you ", Toast.LENGTH_SHORT).show()
        }
        setContentView(R.layout.activity_main)
    }
}