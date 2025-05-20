package com.example.mapboxnavigation

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.mapboxnavigation.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import android.widget.TextView
// Assume you have a UserProfileActivity with a layout file (e.g., activity_user_profile.xml)
// that contains TextViews for displaying the user data

class ProfileActivity : AppCompatActivity() {

    private lateinit var emailTextView: TextView
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        emailTextView = findViewById(R.id.emailTextView)
        firebaseAuth = FirebaseAuth.getInstance()

        val currentUser = firebaseAuth.currentUser
        val email = currentUser?.email

        if (email != null) {
            emailTextView.text = email
        } else {
            emailTextView.text = "No email available"
        }
    }
}