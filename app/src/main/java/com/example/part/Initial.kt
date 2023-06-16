package com.example.part

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class Initial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.initialinterface)
        var timer= Timer()
        class MyTimerTask():TimerTask(){
            override fun run() {
                val switch = Intent(this@Initial,Login::class.java)
                startActivity(switch)
            }
        }
        var timerTask=MyTimerTask()
        timer.schedule(timerTask,1800)
    }
}