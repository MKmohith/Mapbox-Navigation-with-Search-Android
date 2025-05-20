package com.example.mapboxnavigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

public class MapHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContentView(R.layout.activity_map_home)
        val D3: Button = findViewById(R.id.D3)

        // Add this closing parenthesis
        D3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MapHome, MainActivity::class.java)
            startActivity(intent)
        })
    }
}