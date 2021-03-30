package com.chillytaka.royalroad

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chillytaka.royalroad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.loadUrl("https://www.royalroad.com")
        binding.webView.settings.javaScriptEnabled = true
        binding.webView.settings.allowContentAccess = true
    }
}