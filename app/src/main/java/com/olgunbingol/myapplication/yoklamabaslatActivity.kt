package com.olgunbingol.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.olgunbingol.myapplication.databinding.ActivityYoklamabaslatBinding

private lateinit var binding: ActivityYoklamabaslatBinding

class yoklamabaslatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoklamabaslat)
        binding = ActivityYoklamabaslatBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun baslatClicked(view: View) {
        val db = Firebase.firestore

        val postMap = hashMapOf<String, Any>()
        postMap.put("yoklamakodu", binding.yoklamaText.text.toString())
        db.collection("yoklama").add(postMap).addOnSuccessListener {
          finish()
        }.addOnFailureListener {
            Toast.makeText(this@yoklamabaslatActivity,it.localizedMessage,Toast.LENGTH_LONG).show()
        }




    }
}