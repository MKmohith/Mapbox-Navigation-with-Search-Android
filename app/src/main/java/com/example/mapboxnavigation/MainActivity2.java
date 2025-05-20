package com.example.mapboxnavigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;


public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button userButton = (Button) findViewById(R.id.user_button);
        Button commButton = (Button) findViewById(R.id.comm);
        Button hp = (Button) findViewById(R.id.hp);
        Button sos = (Button) findViewById(R.id.sos);
        Button map = (Button) findViewById(R.id.map);
        Button openWebsiteButton = findViewById(R.id.irctc);
        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        // Add this closing parenthesis
        commButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, msg.class);
                startActivity(intent);
            }
        });
        sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SOSMessageSender.class);
                startActivity(intent);
            }
        });
        hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, HelplineActivity.class);
                startActivity(intent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MapHome.class);
                startActivity(intent);
            }
        });

        openWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // URL of the website to open
                String url = "https://www.irctc.co.in/";
                // Create an intent to open the URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                // Start the activity to handle the intent
                startActivity(intent);
            }
        });
    }
}