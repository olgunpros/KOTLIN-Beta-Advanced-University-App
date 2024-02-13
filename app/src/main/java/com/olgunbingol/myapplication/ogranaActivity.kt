package com.olgunbingol.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.olgunbingol.myapplication.databinding.ActivityOgranaBinding

private lateinit var binding: ActivityOgranaBinding
private lateinit var auth: FirebaseAuth
class ogranaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ograna)
        binding = ActivityOgranaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        auth = Firebase.auth

    }
    fun dersprogramiClicked(view: View) {
        val intent = Intent(this@ogranaActivity,dersprogramiActivity::class.java)
        startActivity(intent)
    }
    fun sinavsonucuClicked(view: View) {
        val intent = Intent(this@ogranaActivity,notbakActivity::class.java)
        startActivity(intent)
    }
    fun yoklamaClicked(view: View) {
        val intent = Intent(this@ogranaActivity,yoklamabaslatActivity::class.java)
        startActivity(intent)
    }
    fun duyuruClicked(view: View) {
        val intent = Intent(this@ogranaActivity,duyuruActivity::class.java)
        startActivity(intent)
    }
    fun sikayetClicked(view: View) {
        val intent = Intent(this@ogranaActivity,sikayetActivity::class.java)
        startActivity(intent)
    }
    fun cikisClicked(view: View) {
        val intent = Intent(this@ogranaActivity,MainActivity::class.java)
        startActivity(intent)
    }


}