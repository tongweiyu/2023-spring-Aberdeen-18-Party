package com.example.part

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.localbroadcastmanager.content.LocalBroadcastManager

@Suppress("DEPRECATION")
class Setting : AppCompatActivity() {
    private val add: Button
        get()=findViewById<Button>(R.id.AddS)
    private val Set: Button
        get()=findViewById<Button>(R.id.SettingS)
    private val Home: Button
        get()=findViewById<Button>(R.id.HomeS)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
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
        findViewById<TextView>(R.id.textView17).text = intent?.getStringExtra("Username")
    }
}