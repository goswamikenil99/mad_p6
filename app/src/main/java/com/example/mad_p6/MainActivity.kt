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
        var stop :FloatingActionButton=findViewById(R.id.stop)
        pl.setOnClickListener(){
        playpause()
        }
        stop.setOnClickListener(){
            stop_m()
        }
    }
    fun playpause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { startService(this) }
    }
    fun stop_m(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { stopService(this) }
    }

}