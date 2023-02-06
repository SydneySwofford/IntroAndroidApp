package com.example.helloworld

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //creation of android life cycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val HomeButton=findViewById<Button>(R.id.button)
        HomeButton.setOnClickListener{
            Log.v("Hello World", "Button Clicked")
            Toast.makeText(this, "Hello to you as well!", Toast.LENGTH_LONG).show()
        }
        val snowpic=findViewById<ImageView>(R.id.snowPhoto)
        snowpic.bringToFront()
        //snowpic.setAlpha(0.8f)
        val intotext=findViewById<TextView>(R.id.sydneyIntro).bringToFront()
        val introbckgrnd=findViewById<ImageView>(R.id.introTextBackground)
        introbckgrnd.setAlpha(0.8f)
    }
}