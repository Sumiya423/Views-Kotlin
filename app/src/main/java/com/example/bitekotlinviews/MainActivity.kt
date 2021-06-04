package com.example.bitekotlinviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeButton.setOnClickListener {
            helloText.text="Bite in Android with Kotlin"
        }
        toastButton.setOnClickListener {
            Toast.makeText(this,"Bite in Android with Kotlin",Toast.LENGTH_LONG).show()

        }
        toastButton2.setOnClickListener {
            if(editText.text.isEmpty()){
                editText.setError("Please enter something!")
            }
            else{
                val value=editText.text.toString()
                Toast.makeText(this,value,Toast.LENGTH_LONG).show()
                editText.text.clear()
            }
        }

        intentButton.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}