package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class MyActivityResultContract3 : ActivityResultContract<String,String>() {
    override fun createIntent(context: Context, input: String): Intent {
        return Intent(context, Main2Activity::class.java).apply {
            putExtra("dataTransfer",input)
        }
    }

    override fun parseResult(resultCode: Int, intent: Intent?): String {
        val data = intent?.getStringExtra("result")
        return  if(resultCode == Activity.RESULT_OK && data != null) data
        else ""
    }
}