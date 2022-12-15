package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.myapplication.R

class Main3Activity : AppCompatActivity() {

    var iceGroup: RadioGroup? = null
    var sugarGroup: RadioGroup? = null
    var drinkGroup: RadioGroup? = null
    lateinit var ice: RadioButton
    lateinit var sugar: RadioButton
    lateinit var selectedDrink: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var tvTable3=findViewById<TextView>(R.id.tv_table3)
        var btnDrinkConfirm=findViewById<Button>(R.id.btn_drinkConfirm)

        //輸入飲料名稱
        //綁定單選清單群
        drinkGroup = findViewById(R.id.radioGroup)
        sugarGroup = findViewById(R.id.radioGroup1)
        iceGroup = findViewById(R.id.radioGroup2)

        //接收並顯示由主頁intent傳來之桌次
        tvTable3.text= intent.getStringExtra("dataTransfer")

        btnDrinkConfirm.setOnClickListener {
            // 由單選清單 radioGroup 取得選項ID,!!表不可為null
            var selectedOption: Int = iceGroup!!.checkedRadioButtonId
            // 由選項ID取得冰塊量
            ice = findViewById(selectedOption)
            //Toast.makeText(baseContext, ice.text, Toast.LENGTH_SHORT).show()

            // 由選項ID取得甜度
            selectedOption = sugarGroup!!.checkedRadioButtonId
            sugar = findViewById(selectedOption)
            //Toast.makeText(baseContext, sugar.text, Toast.LENGTH_SHORT).show()

            // 由選項ID取得選取之飲料別
            selectedOption = drinkGroup!!.checkedRadioButtonId
            selectedDrink = findViewById(selectedOption)


            val finalDrink = "${selectedDrink.text} \n\n甜度：${sugar.text} \n\n冰塊：${ice.text}"
            val intent = Intent().apply {
                putExtra("result", "$finalDrink")
            }

            //透過setResult將資料回傳
            setResult(Activity.RESULT_OK, intent)
            //結束Main2Activity
            finish()
        }
    }
}