package com.example.bindingadapters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post = Post(
            "Binding",
            "Binding adapters",
            "https://miro.medium.com/max/1400/1*0ruPb4xxSoDV_fSt7MhuMQ.png"
        )

        binding.post = post
    }
}