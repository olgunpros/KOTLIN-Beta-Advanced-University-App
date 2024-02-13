package com.olgunbingol.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.olgunbingol.myapplication.databinding.ActivityNotekleBinding

private lateinit var binding: ActivityNotekleBinding
class notekleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notekle)
        binding = ActivityNotekleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun ekleClicked(view: View) {
        val db = Firebase.firestore

        val postMap = hashMapOf<String,Any>()
        postMap.put("dersinadi", binding.dersadiText.text.toString())
        postMap.put("not",binding.notText.text.toString())

        db.collection("notlar").add(postMap).addOnSuccessListener {
            finish()

        }.addOnFailureListener {
            Toast.makeText(this@notekleActivity,it.localizedMessage,Toast.LENGTH_LONG).show()
        }



    }




}