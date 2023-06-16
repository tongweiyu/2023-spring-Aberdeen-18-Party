package com.example.part

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registerinterface)
        findViewById<Button>(R.id.register).setOnClickListener{
            if(findViewById<EditText>(R.id.editPassword).text.toString() == findViewById<EditText>(R.id.ConfirmPassword).text.toString() ){
                val intent = Intent(this,Log::class.java)
                intent.putExtra("newUserName",findViewById<EditText>(R.id.editName).text.toString())
                intent.putExtra("newPassword",findViewById<EditText>(R.id.editPassword).text.toString())
                startActivity(intent)
            }
            else{
                val confirm = Toast.makeText(this, "Please ensure your password again....", Toast.LENGTH_LONG)
                confirm.show()
            }

        }
    }
}