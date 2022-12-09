package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var tvTable3 = findViewById<TextView>(R.id.tv_table3)
        var btnDrinkConfirm = findViewById<Button>(R.id.btn_drinkConfirm)

        tvTable3.text = intent.getStringExtra("dataTransfer")

        btnDrinkConfirm.setOnClickListener {
            var selectedOption : Int =
        }
    }
}