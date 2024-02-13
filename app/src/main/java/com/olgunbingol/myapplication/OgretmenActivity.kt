package com.olgunbingol.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.olgunbingol.myapplication.databinding.ActivityOgretmenBinding

private lateinit var binding: ActivityOgretmenBinding
private lateinit var auth: FirebaseAuth
class OgretmenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogretmen)
        binding = ActivityOgretmenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        auth = Firebase.auth
    }
    fun signinClicked(view: View) {
        val email = binding.emailTextt.text.toString()
        val password = binding.passwordTextt.text.toString()

        if(email.isNotEmpty() && password.isNotEmpty()) {
         auth.signInWithEmailAndPassword(email,password).addOnSuccessListener {
             val intent = Intent(this@OgretmenActivity,ogretmenanaActivity::class.java)
             startActivity(intent)
         }.addOnFailureListener {
             Toast.makeText(this@OgretmenActivity,it.localizedMessage,Toast.LENGTH_LONG).show()

         }
        }
        else {
            Toast.makeText(this@OgretmenActivity,"Username? / Password?",Toast.LENGTH_LONG).show()
        }
    }
}