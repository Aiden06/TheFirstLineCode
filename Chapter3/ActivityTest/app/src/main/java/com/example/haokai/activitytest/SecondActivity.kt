package com.example.haokai.activitytest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.second_layout.*

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Log.d("SecondActivity", this.toString())
        Log.d("SecondActivity", "Task id is $taskId")
        setContentView(R.layout.second_layout)
        //val extraData = intent.getStringExtra("extra_data")
        //Log.d("SecondaryActivity", "extra data is $extraData")
        button2.setOnClickListener{
            //val intent = Intent()
            //intent.putExtra("data_return", "Hello FirstActivity")
            //setResult(RESULT_OK, intent)
            //finish()
            //val intent = Intent(this, FirstActivity::class.java)
            val intent = Intent(this,ThirdActivity::class.java)
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

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroy")
    }

    companion object{
        fun actionStart(context: Context, data1: String, data2: String){
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("param1", data1)
            intent.putExtra("param2", data2)
            context.startActivity(intent)
        }
    }
}