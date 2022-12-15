package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnMealConfirm = findViewById<Button>(R.id.btn_mealConfirm)
        var tvTable2 = findViewById<TextView>(R.id.tv_table2)

        tvTable2.text = intent.getStringExtra("dataTransfer")


        btnMealConfirm.setOnClickListener {
            lateinit var mealA :CheckBox
            lateinit var mealB :CheckBox
            lateinit var mealC :CheckBox
            lateinit var mealD :CheckBox
            mealA = findViewById(R.id.checkBox)
            mealB = findViewById(R.id.checkBox2)
            mealC = findViewById(R.id.checkBox3)
            mealD= findViewById(R.id.checkBox4)
            var meal1 =if (mealA.isChecked)"A餐" else ""
            var meal2 =if (mealA.isChecked)"B餐" else ""
            var meal3 =if (mealA.isChecked)"C餐" else ""
            var meal4 =if (mealA.isChecked)"D餐" else ""
            val meal = "$meal1 $meal2 $meal3 $meal4"

            val intent = Intent().apply{
                putExtra("result","$meal")
            }

            setResult(Activity.RESULT_OK,intent)

            finish()
        }

    }
}