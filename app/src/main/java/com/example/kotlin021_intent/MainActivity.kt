package com.example.kotlin021_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Main Activity Opned", Toast.LENGTH_LONG).show();

        btnFirstActivity.setOnClickListener(){
            intent = Intent(this,FirstActivity::class.java);
            startActivity(intent);
        }

        btnToast.setOnClickListener(){
            Toast.makeText(applicationContext, "Second Button Pressed", Toast.LENGTH_LONG).show();

        }


    }
}