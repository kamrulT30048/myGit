package com.kamrulhasan.debugingapp

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    //private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val helloTextView: TextView = findViewById(R.id.tv_bjit)
        helloTextView.text = "Hello, debugging"

        setContentView(R.layout.activity_main)



        logIn()
        division()

    }
    private fun logIn(){
        Log.e(TAG, "error massage")
        Log.w(TAG, "warning massage")
        Log.i(TAG, "info massage")
        Log.d(TAG, "Debug massage")
        Log.v(TAG, "Verbose massage")
    }

    private fun division() {
        val numerator = 60
        var denominator = 4
        repeat(6) {
            var v = numerator/denominator
            //Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }
}
