package com.example.haokai.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.second_layout.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity", this.toString())
        setContentView(R.layout.second_layout)
        //val extraData = intent.getStringExtra("extra_data")
        //Log.d("SecondaryActivity", "extra data is $extraData")
        button2.setOnClickListener{
            //val intent = Intent()
            //intent.putExtra("data_return", "Hello FirstActivity")
            //setResult(RESULT_OK, intent)
            //finish()
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        Log.d("SecondActivity", "back pressed.")
        val intent = Intent()
        intent.putExtra("data_return", "Hello FirstActivity")
        setResult(RESULT_OK, intent)
        finish()
    }
}