package com.example.part

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Add : AppCompatActivity() {
    private val add: Button
        get()=findViewById<Button>(R.id.addA)
    private val Set: Button
        get()=findViewById<Button>(R.id.SettingA)
    private val Home: Button
        get()=findViewById<Button>(R.id.HomeA)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        add.setOnClickListener {
            val c = Intent(this, Add::class.java)
            startActivity(c)
        }
        Set.setOnClickListener {
            val c = Intent(this, Setting::class.java)
            startActivity(c)
        }
        Home.setOnClickListener {
            val c = Intent(this, Main::class.java)
            startActivity(c)
        }
    }

}