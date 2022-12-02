package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMeal = findViewById<Button>(R.id.btn_meal)
        var btnDrink = findViewById<Button>(R.id.btn_drink)
        var tableNo = findViewById<EditText>(R.id.ed_tableNo)
        var tvMeal = findViewById<TextView>(R.id.tv_meal)
        var txtTableNo = tableNo.text
        var tvDrink = findViewById<TextView>(R.id.tv_drink)
        var btnReorder = findViewById<Button>(R.id.btn_reOrder)

        btnMeal.setOnClickListener{
            if(tableNo.length()<1)
                tableNo.hint = "請輸入桌號!"
            else{
            }
        }
    }
}