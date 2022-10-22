package com.example.practic10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var buttonState: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
     fun test(view: View) {
        val button1: TextView = findViewById(R.id.button1)
        val button2: TextView = findViewById(R.id.button2)

        if(buttonState == true){
            button1.setVisibility(View.GONE)
            button2.setVisibility(View.VISIBLE)
            buttonState = false
        }
        else{
            button1.setVisibility(View.VISIBLE)
            button2.setVisibility(View.INVISIBLE)
            buttonState = true
        }
    }
}
