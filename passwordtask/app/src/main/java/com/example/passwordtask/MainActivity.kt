package com.example.passwordtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun vvod(view: View)
    {
        val password: EditText = findViewById(R.id.editTextTextPersonName2)
        val error = findViewById<TextView>(R.id.textView)
        if(password.length()<=5)
        {
            error.setText("Минимальное количество для ввода пароля 6 символов вплоть до 7")
        }
        else{
            error.setText("")

        }
    }
}