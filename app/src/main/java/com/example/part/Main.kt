package com.example.part

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView


class Main : AppCompatActivity() {
    private val add:Button
        get()=findViewById<Button>(R.id.addH)
    private val Set:Button
        get()=findViewById<Button>(R.id.SettingH)
    private val home: Button
        get()=findViewById<Button>(R.id.HomeH)
    private val change:LinearLayout
        get() = findViewById(R.id.A1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maininterface)

        add.setOnClickListener {
            val c = Intent(this, Add::class.java)
            startActivity(c)
        }
        Set.setOnClickListener {
            val c = Intent(this, Setting::class.java)
            val str : String? = intent?.getStringExtra("Username")
            c.putExtra("Username",str)
            startActivity(c)
    }
        home.setOnClickListener {
            val c = Intent(this, Main::class.java)
            startActivity(c)
}
        change.setOnClickListener{
            val d = Intent(this, Introduction::class.java)
            startActivity(d)
        }
}
}