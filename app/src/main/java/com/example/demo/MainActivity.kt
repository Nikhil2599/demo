package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etname:EditText
    lateinit var etpass:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etname=findViewById(R.id.etname)
        etpass=findViewById(R.id.etpass)


    }

    fun handleClicks(view: View) {
        var name= etname.text.toString()
        var hIntent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("nkey",name)
        startActivity(hIntent)
    }
}