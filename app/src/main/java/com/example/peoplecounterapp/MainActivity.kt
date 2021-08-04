package com.example.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.peoplecounterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //get refrence to button and textview
        val btn_clicked_me=binding.Count
        val myTextView=binding.peopleCounts
        var timesClicked=0
        //Implementing buttom click listner
binding.Count.setOnClickListener{
    timesClicked=timesClicked+1
    binding.peopleCounts.setText("count is$timesClicked")
}
}
}