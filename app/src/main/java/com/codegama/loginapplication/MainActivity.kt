package com.codegama.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this@MainActivity,"Welcome to my Application",Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}