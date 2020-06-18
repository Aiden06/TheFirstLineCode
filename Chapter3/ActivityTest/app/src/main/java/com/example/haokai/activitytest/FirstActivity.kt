package com.example.haokai.activitytest

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FirstActivity", this.toString())
        setContentView(R.layout.first_layout)
        button1.setOnClickListener {
            //Toast.makeText(this, "You clicked Button 1", Toast.LENGTH_SHORT).show()
            //finish()
            //val intent = Intent(this, SecondActivity::class.java)
            //val intent = Intent("com.example.haokai.activitytest.ACTION_START")
            //intent.addCategory("com.example.haokai.activitytest.MY_CATEGORY")
            //val intent = Intent(Intent.ACTION_VIEW)
            //intent.data = Uri.parse("https://www.baidu.com")
            //val intent = Intent(Intent.ACTION_DIAL)
            //intent.data = Uri.parse("tel:10086")
            //val data = "Hello SecondActivity"
            //val intent = Intent(this, SecondActivity::class.java)
            //intent.putExtra("extra_data", data)
            //startActivity(intent)
            //val intent = Intent(this, SecondActivity::class.java)
            //startActivityForResult(intent, 1)
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            1 -> if(resultCode == Activity.RESULT_OK){
                val returnedData = data?.getStringExtra("data_return")
                Log.d("FirstActivity", "returned data is $returnedData")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this, "You clicked Add",
                Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove",
                Toast.LENGTH_SHORT).show()
        }
        return true
    }
}