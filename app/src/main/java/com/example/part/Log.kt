package com.example.part

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.google.android.material.textfield.TextInputEditText

class Log : AppCompatActivity() {
    private val userName:EditText
        get() =findViewById(R.id.YourName)

    private val userPassWord:EditText
        get() =findViewById(R.id.YourPassword)

    private val loginButton:Button
        get() =findViewById(R.id.log)


    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginterface)

        loginButton.setOnClickListener{
            val name = userName.text.toString()
            val password = userPassWord.text.toString()
            val namekey = intent.getStringExtra("newUserName")
            val passwordkey = intent.getStringExtra("newPassword")
            val x = 1
            if (x>0){
                if (name.isNotEmpty() && password.isNotEmpty()) {
                    if(name == namekey && password == passwordkey){
                        val intent = Intent(this, Choose::class.java)
                        intent.putExtra("Username",namekey)
                        startActivity(intent)
                    }else{
                        val wrongtoast = Toast.makeText(this,"wrong name or wrong password",Toast.LENGTH_LONG)
                        wrongtoast.show()
                    }
                }
            }
        }
    }
}