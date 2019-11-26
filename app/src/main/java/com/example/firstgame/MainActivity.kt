package com.example.firstgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener  {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton = findViewById<Button>(R.id.btnPlay)

        playButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }

}


