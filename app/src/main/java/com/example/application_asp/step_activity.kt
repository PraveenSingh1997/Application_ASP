package com.example.application_asp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class step_activity : AppCompatActivity() {

     lateinit var steps : TextView
     private lateinit var Next : Button
     private lateinit var showAll : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step)

        steps = findViewById(R.id.steps)
        Next = findViewById(R.id.Next)
        showAll = findViewById(R.id.show_all)


        val arr: IntArray = intArrayOf(15, 3, 12, 6, -9, 9, 0,-3);


        val lastIndex: Int = arr.size - 1
        var a : Int  = 0
        for (i in 1..lastIndex) {

            print("Step $i: [")
            steps.append("Step $i : [")
            val temp: Int = arr[i]
            var holePosition: Int = i

            while(holePosition > 0 && arr[holePosition - 1] > temp) {
                arr[holePosition] = arr[holePosition - 1]
                holePosition--
            }

            arr[holePosition] = temp
            for (i in 0..lastIndex) {
               val num = arr[i]
               steps.append("$num ,")

            }

            steps.append("]")
            steps.append("\n")
            steps.append("\n")


            }
            }
            }


