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


    private lateinit var text1: EditText
    private lateinit var text2: EditText
    private lateinit var text3: EditText
    private lateinit var text4: EditText
    private lateinit var text5: EditText
    private lateinit var run: Button
    private lateinit var reset: Button
    private lateinit var string: String
    private lateinit var view1: TextView
    private lateinit var result : TextView
    private lateinit var option : Spinner
    private lateinit var selectedOption : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        text3 = findViewById(R.id.text3)
        text4 = findViewById(R.id.text4)
        text5 = findViewById(R.id.text5)
        run = findViewById(R.id.run)
        reset = findViewById(R.id.reset)
        view1 = findViewById(R.id.sum)
        result = findViewById(R.id.result)
        option = findViewById(R.id.option)
        selectedOption = findViewById(R.id.selectedOption)




        val options = arrayOf("Select","2","3","4","5","6","7","8")

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , options)

        option.onItemSelectedListener  = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                selectedOption.text = options.get(p2)
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











        run.setOnClickListener { view: View ->
            var input1 = text1.text.toString().toInt()
            var input2 = text2.text.toString().toInt()
            var input3 = text3.text.toString().toInt()
            var input4 = text4.text.toString().toInt()
            var input5 = text5.text.toString().toInt()

            val arr : IntArray = intArrayOf(input1, input2, input3, input4, input5)
            //val inputs = listOf(input1, input2, input3, input4, input5)
            println(arr)
            val finalInput = arr
            //string = text1.text.toString() + text2.text.toString()
            //println(string)
            view1.text = arr.contentToString()



            //val arr: IntArray = intArrayOf(15, 3, 12, 6, -9, 9, 0);


            val lastIndex: Int = arr.size - 1

            for (i in 1..lastIndex) {
                val temp: Int = arr[i]
                var holePosition: Int = i
                while(holePosition > 0 && arr[holePosition - 1] > temp) {
                    arr[holePosition] = arr[holePosition - 1]
                    holePosition--
                }
                arr[holePosition] = temp
                println(temp)

            }


            for (i in 0..lastIndex) {
                val num = arr[i]
                print("$num ")

            }



            result.text = arr.contentToString()



                //view1.text = arr.toString()

            print("After Sorting: ")



        }
    }
}

