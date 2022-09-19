package com.example.application_asp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.text.isDigitsOnly

class three_activity : AppCompatActivity() {
    private lateinit var text1: EditText
    private lateinit var text2: EditText
    private lateinit var text3: EditText

    private lateinit var run: Button
    private lateinit var reset: Button
    //private lateinit var string: String
    private lateinit var view1: TextView
    private lateinit var result : TextView
    private lateinit var option : Spinner
    private lateinit var selectedOption : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        text3 = findViewById(R.id.text3)
        run = findViewById(R.id.run)
        reset = findViewById(R.id.reset)
        view1 = findViewById(R.id.sum)
        result = findViewById(R.id.result)



        run.setOnClickListener { view: View ->



            if(text1.text.isDigitsOnly() and text2.text.isDigitsOnly() and text3.text.isDigitsOnly()){
                var input1 = text1.text.toString().toInt()
                var input2 = text2.text.toString().toInt()
                var input3 = text3.text.toString().toInt()


                val arr : IntArray = intArrayOf(input1, input2 , input3)
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
            else {
                Toast.makeText(this , "Enter Digits only" , Toast.LENGTH_SHORT).show()
            }

        }
        reset.setOnClickListener{view : View ->

            var input1 = text1.setText("")
            var input2 = text2.setText("")
            var input3 = text3.setText("")

        }
    }
}

