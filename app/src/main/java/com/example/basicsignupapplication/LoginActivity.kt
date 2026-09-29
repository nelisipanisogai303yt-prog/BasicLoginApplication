package com.example.basicsignupapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val failedTextView = findViewById<TextView>(R.id.failedTextView)

        loginButton.setOnClickListener {

            val username = usernameEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {

                failedTextView.text = "Please enter both username and password"

            } else if (username == "JuanMarco" && password == "104865") {

                failedTextView.text = ""

                Toast.makeText(
                    this,
                    "Successful login!",
                    Toast.LENGTH_SHORT
                ).show()

                val intent = Intent(this, WelcomeActivity::class.java)

                startActivity(intent)
                finish()

            } else {

                failedTextView.text = "Incorrect username or password"
            }
        }
    }
}
