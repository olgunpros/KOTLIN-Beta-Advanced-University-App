package com.olgunbingol.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.olgunbingol.myapplication.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun ogrenciClicked(view: View) {
        val intent = Intent(this@MainActivity,OgrenciActivity::class.java)
        startActivity(intent)

    }
    fun ogretmenClicked(view: View) {
        val intent = Intent(this@MainActivity,OgretmenActivity::class.java)
        startActivity(intent)
    }
}