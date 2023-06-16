package com.example.part

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.core.os.persistableBundleOf


class Choose : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chooseinterface)
        val submit = findViewById<Button>(R.id.submit)
        submit.setOnClickListener {
            val ch = Intent(this, Main::class.java)
            val str : String? = intent?.getStringExtra("Username")
            ch.putExtra("Username",str)
            startActivity(ch)
        }
        initView()
        }
    private fun initView(){
        val choosePicBtn1: ImageButton = findViewById(R.id.btn1)
        val choosePicBtn2: ImageButton = findViewById(R.id.btn2)
        val choosePicBtn3: ImageButton = findViewById(R.id.btn3)
        val choosePicBtn4: ImageButton = findViewById(R.id.btn4)
        val choosePicBtn5: ImageButton = findViewById(R.id.btn5)
        choosePicBtn1.setOnClickListener { choosePic() }
        choosePicBtn2.setOnClickListener { choosePic2() }
        choosePicBtn3.setOnClickListener { choosePic3() }
        choosePicBtn4.setOnClickListener { choosePic4() }
        choosePicBtn5.setOnClickListener { choosePic5() }

    }
    var x: Int = 1
    private fun choosePic(){
        var choosePic = choosePicstu(x)
        var Pic = choosePic.add1()
        val PicResource  = when(Pic){
            1 -> R.drawable.stu
            2 -> R.drawable.stuy
            3 -> R.drawable.stu
            else -> R.drawable.stu
        }
        val PicImage: ImageButton = findViewById(R.id.btn1)
        PicImage.setBackgroundResource(PicResource)
    }
    class choosePicstu(var x: Int){
        fun add1(): Int {
            ++x
            return x
        }
    }
    var y: Int = 1
    private fun choosePic2(){
        var choosePic = choosePicspo(y)
        var Pic = choosePic.add1()
        val PicResource  = when(Pic){
            1 -> R.drawable.spo
            2 -> R.drawable.spoy
            3 -> R.drawable.spo
            else -> R.drawable.spo
        }
        val PicImage: ImageButton = findViewById(R.id.btn2)
        PicImage.setBackgroundResource(PicResource)
    }
    class choosePicspo(var y: Int){
        fun add1(): Int {
            ++y
            return y
        }
    }
    var a: Int = 1
    private fun choosePic3(){
        var choosePic = choosePiccon(a)
        var Pic = choosePic.add1()
        val PicResource  = when(Pic){
            1 -> R.drawable.contest
            2 -> R.drawable.conty
            3 -> R.drawable.contest
            else -> R.drawable.contest
        }
        val PicImage: ImageButton = findViewById(R.id.btn3)
        PicImage.setBackgroundResource(PicResource)
    }
    class choosePiccon(var a: Int){
        fun add1(): Int {
            ++a
            return a
        }
    }
    var b: Int = 1
    private fun choosePic4(){
        var choosePic = choosePicfoo(b)
        var Pic = choosePic.add1()
        val PicResource  = when(Pic){
            1 -> R.drawable.food
            2 -> R.drawable.foody
            3 -> R.drawable.food
            else -> R.drawable.food
        }
        val PicImage: ImageButton = findViewById(R.id.btn4)
        PicImage.setBackgroundResource(PicResource)
    }
    class choosePicfoo(var b: Int){
        fun add1(): Int {
            ++b
            return b
        }
    }
    var c: Int = 1
    private fun choosePic5(){
        var choosePic = choosePicfun(c)
        var Pic = choosePic.add1()
        val PicResource  = when(Pic){
            1 -> R.drawable.`fun`
            2 -> R.drawable.funy
            3 -> R.drawable.`fun`
            else -> R.drawable.`fun`
        }
        val PicImage: ImageButton = findViewById(R.id.btn5)
        PicImage.setBackgroundResource(PicResource)
    }
    class choosePicfun(var c: Int){
        fun add1(): Int {
            ++c
            return c
        }
    }
}


