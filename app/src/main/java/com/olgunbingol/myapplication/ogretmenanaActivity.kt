package com.olgunbingol.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ogretmenanaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogretmenana)
    }

    fun girClicked(view: View) {
        val intent = Intent(this@ogretmenanaActivity,notekleActivity::class.java)
        startActivity(intent)
    }

    fun yoklamabaslatClicked(view: View) {
        val intent = Intent(this@ogretmenanaActivity,yoklamabaslatActivity::class.java)
        startActivity(intent)
    }
    fun duyuruClicked(view: View) {
        val intent = Intent(this@ogretmenanaActivity,duyuruActivity::class.java)
        startActivity(intent)
    }
    fun sikayetClicked(view: View) {
        val intent = Intent(this@ogretmenanaActivity,sikayetActivity::class.java)
        startActivity(intent)
    }
    fun cikisClickedd(view: View) {
        val intent = Intent(this@ogretmenanaActivity,MainActivity::class.java)
        startActivity(intent)
    }

}