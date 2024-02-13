package com.olgunbingol.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.olgunbingol.myapplication.databinding.ActivitySikayetBinding

private lateinit var binding: ActivitySikayetBinding
class sikayetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sikayet)
        binding = ActivitySikayetBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun gonderClicked(view: View) {
        val db = Firebase.firestore
        val postMap = hashMapOf<String, Any>()
        postMap.put("baslik", binding.sikayetText.text.toString())
        postMap.put("icerik", binding.icerikText.text.toString())
        db.collection("sikayetler").add(postMap).addOnSuccessListener {
            finish()
        }.addOnFailureListener {
            Toast.makeText(this@sikayetActivity,it.localizedMessage, Toast.LENGTH_LONG).show()
        }




    }

}