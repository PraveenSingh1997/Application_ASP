package com.example.application_asp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.INFO
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.core.text.isDigitsOnly
import java.util.logging.Level.INFO

class eight_activity : AppCompatActivity() {
    private lateinit var text1: EditText
    private lateinit var text2: EditText
    private lateinit var text3: EditText
    private lateinit var text4 : EditText
    private lateinit var text5 : EditText
    private lateinit var text6 : EditText
    private lateinit var text7 : EditText
    private lateinit var text8 : EditText

    private lateinit var run: Button
    private lateinit var show_steps : Button
    private lateinit var reset: Button

    private lateinit var steps : TextView

    //private lateinit var string: String
    private lateinit var view1: TextView
    private lateinit var result : TextView
    private lateinit var option : Spinner
    private lateinit var selectedOption : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)
        //println("Steps")






        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        text3 = findViewById(R.id.text3)
        text4 = findViewById(R.id.text4)
        text5 = findViewById(R.id.text5)
        text6 = findViewById(R.id.text6)
        text7 = findViewById(R.id.text7)
        text8 = findViewById(R.id.text8)
        run = findViewById(R.id.run)
        steps = findViewById(R.id.steps)



        show_steps = findViewById(R.id.show_steps)
        reset = findViewById(R.id.reset)
        view1 = findViewById(R.id.sum)
        result = findViewById(R.id.result)

        run.setOnClickListener{view : View ->





                if(text1.text.isDigitsOnly() and text2.text.isDigitsOnly() and text3.text.isDigitsOnly() and text4.text.isDigitsOnly() and text5.text.isDigitsOnly() and text6.text.isDigitsOnly() and text7.text.isDigitsOnly() and text8.text.isDigitsOnly()){
                    var input1 = text1.text.toString().toInt()
                    var input2 = text2.text.toString().toInt()
                    var input3 = text3.text.toString().toInt()
                    var input4 = text4.text.toString().toInt()
                    var input5 = text5.text.toString().toInt()
                    var input6 = text6.text.toString().toInt()
                    var input7 = text7.text.toString().toInt()
                    var input8 = text8.text.toString().toInt()


                    val arr : IntArray = intArrayOf(input1, input2 , input3 , input4 , input5 , input6 , input7 , input8)

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
                    //33startActivity(intent)
                }

        }
        show_steps.setOnClickListener { view: View ->

            var str = ""
            var str2 = ""
            var str3 = ""



            var input1 = text1.text.toString().toInt()
            var input2 = text2.text.toString().toInt()
            var input3 = text3.text.toString().toInt()
            var input4 = text4.text.toString().toInt()
            var input5 = text5.text.toString().toInt()
            var input6 = text6.text.toString().toInt()
            var input7 = text7.text.toString().toInt()
            var input8 = text8.text.toString().toInt()


            val arr : IntArray = intArrayOf(input1, input2 , input3 , input4 , input5 , input6 , input7 , input8)
            //val inputs = listOf(input1, input2, input3, input4, input5)
            println(arr)
            val finalInput = arr
            //string = text1.text.toString() + text2.text.toString()
            //println(string)
            view1.text = arr.contentToString()

            str = arr.contentToString()
            //val str2 = intArrayOf(input1, input2 , input3 , input4 , input5 , input6 , input7 , input8).contentToString()
            // Create the Intent object of this class Context() to Second_activity class
            val intent = Intent(applicationContext, step_activity::class.java)
            // now by putExtra method put the value in key, value pair key is
            // message_key by this key we will receive the value, and put the string
            intent.putExtra("message_key", str)

            // start the Intent




            if(text1.text.isDigitsOnly() and text2.text.isDigitsOnly() and text3.text.isDigitsOnly() and text4.text.isDigitsOnly() and text5.text.isDigitsOnly() and text6.text.isDigitsOnly() and text7.text.isDigitsOnly() and text8.text.isDigitsOnly()){


                val arr : IntArray = intArrayOf(input1, input2 , input3 , input4 , input5 , input6 , input7 , input8)
                //val inputs = listOf(input1, input2, input3, input4, input5)
                println(arr)
                val finalInput = arr
                //string = text1.text.toString() + text2.text.toString()
                //println(string)
                view1.text = arr.contentToString()



                //val arr: IntArray = intArrayOf(15, 3, 12, 6, -9, 9, 0);


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
                    print("$steps")

                }

                str3 = steps.text.toString()
                str3.replace(",]","]")

                println("str3")
                print("$str3")
                intent.putExtra("steps" , str3)


                result.text = arr.contentToString()
                str2 = arr.contentToString()



                intent.putExtra("output" ,str2 )



                //view1.text = arr.toString()

                print("After Sorting: ")
                startActivity(intent)
            }
            else {
                Toast.makeText(this , "Enter Digits only" , Toast.LENGTH_SHORT).show()
            }

        }
        reset.setOnClickListener{view : View ->

            var input1 = text1.setText("")
            var input2 = text2.setText("")
            var input3 = text3.setText("")
            var input4 = text4.setText("")
            var input5 = text5.setText("")
            var input6 = text6.setText("")
            var input7 = text7.setText("")
            var input8 = text8.setText("")
            result.setText("")
            view1.setText("")

        }
    }
}
