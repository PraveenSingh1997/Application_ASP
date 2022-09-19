package com.example.application_asp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class splash_screen_activity : AppCompatActivity() {

    private lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        button1 = findViewById(R.id.button1)

        button1.setOnClickListener{view : View ->
            startActivity(Intent(this@splash_screen_activity, MainActivity::class.java))

        }


    }
}