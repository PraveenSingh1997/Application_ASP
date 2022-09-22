package com.example.application_asp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class step_activity : AppCompatActivity() {

     private lateinit var steps : TextView
     private lateinit var Next : Button
     private lateinit var showAll : Button
     private lateinit var input_received : TextView
     private lateinit var output : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step)

        steps = findViewById(R.id.steps)
        Next = findViewById(R.id.Next)
        showAll = findViewById(R.id.show_all)
        input_received = findViewById(R.id.input_received);
        output = findViewById(R.id.output)

        steps.setText("nnnnnnnnnnnnnnnn")



        val intent = intent
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        var str = intent.getStringExtra("message_key")
        var str2 = intent.getStringExtra("output")
        var str3 = intent.getStringExtra("steps")

        // display the string into textView
        // display the string into textView
         input_received.setText(str)
        //output.setText(str2.toString())

        output.text = str2.toString()
        val inputs = str.toString()
        val arr = inputs.map { it.code }.toTypedArray()
        //val arr: IntArray = intArrayOf(15, 3, 12, 6, -9, 9, 0);
        steps.text = str3.toString()








            }
            }



