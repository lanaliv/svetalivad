package com.example.a3_zadaniye

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

val somelist = listOf<Int>(
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    "10"
)

var list = mutableListOf<Int>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in somelist) {
            list.add(i)
        }
        printOnScreen()
    }

    fun printOnScreen() {

        val textView: TextView = findViewById(R.id.textView)

        textView.text = list.toString()
    }
        println(list)

}