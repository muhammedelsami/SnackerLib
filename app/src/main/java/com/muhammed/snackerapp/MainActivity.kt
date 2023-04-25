package com.muhammed.snackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhammed.snacker.Snacker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Snacker.showDefaultToast(this)
        Snacker.newSnackBar(findViewById(android.R.id.content), "this is a default toast", 10000, 1).show()
    }
}