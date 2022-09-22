package com.example.application_asp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.view.get

class MainActivity : AppCompatActivity() {






    private lateinit var option : Spinner
    private lateinit var about_us : Button
    //private lateinit var selectedOption : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        about_us = findViewById(R.id.about_us)
        option = findViewById(R.id.option)
        //selectedOption = findViewById(R.id.selectedOption)

        about_us.setOnClickListener { view: View ->

            val intent = Intent(this, about_us_activity::class.java)

            startActivity(intent)


        }




        val options = arrayOf("Select Number of Digit","2","3","4","5","6","7","8")

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , options)

        option.onItemSelectedListener  = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //selectedOption.text = options.get(p2)
                if (options.get(p2) == "2") {
                    startActivity(Intent(this@MainActivity, two_activity::class.java))

                }
                else if (options.get(p2) == "3"){
                    startActivity(Intent(this@MainActivity, three_activity::class.java))

                }
                else if (options.get(p2) == "4"){
                    startActivity(Intent(this@MainActivity, four_activity::class.java))

                }
                else if (options.get(p2) == "5"){
                    startActivity(Intent(this@MainActivity, five_activity::class.java))

                }
                else if (options.get(p2) == "6"){
                    startActivity(Intent(this@MainActivity, six_activity::class.java))

                }
                else if (options.get(p2) == "7"){
                    startActivity(Intent(this@MainActivity, seven_activity::class.java))

                }
                else if (options.get(p2) == "8"){
                    startActivity(Intent(this@MainActivity, eight_activity::class.java))

                }
                else {} }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
            //selectedOption.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MainActivity , two_activity::class.java)) })
            }

    }
}

