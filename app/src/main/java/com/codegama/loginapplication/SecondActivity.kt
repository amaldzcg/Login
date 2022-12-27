package com.codegama.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageButton = findViewById <Button>(R.id.image_button)
        val videoButton = findViewById <Button>(R.id.video_button)
        imageButton.setOnClickListener {
            Toast.makeText(applicationContext,"click the button on1", Toast.LENGTH_LONG).show()
            // TO DO Show Image
        }

        videoButton.setOnClickListener {
            Toast.makeText(applicationContext,"click the button on2", Toast.LENGTH_LONG).show()
            // TO DO SHOW VIDEO
        }

    }
}