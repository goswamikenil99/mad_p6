package com.example.mad_p6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pl :FloatingActionButton=findViewById(R.id.play)
        pl.setOnClickListener(){
        startService(Intent(this,music_k::class.java));
        }
    }
}