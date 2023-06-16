package com.example.part

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    private val signUp: Button
        get() = findViewById(R.id.signbutton)

    private val log1: TextView
        get() = findViewById(R.id.log1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logininterface)
        signUp.setOnClickListener{
            val signup = Intent(this, Register::class.java)
            startActivity(signup)

        log1.setOnClickListener {
            val register1 = Intent(this, Log::class.java)
            startActivity(register1)
            }
        }


    }
}

