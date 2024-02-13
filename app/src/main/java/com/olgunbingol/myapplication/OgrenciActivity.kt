package com.olgunbingol.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.olgunbingol.myapplication.databinding.ActivityMainBinding
import com.olgunbingol.myapplication.databinding.ActivityOgrenciBinding

private lateinit var binding: ActivityOgrenciBinding
private lateinit var auth: FirebaseAuth
class OgrenciActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogrenci)
        binding = ActivityOgrenciBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        auth = Firebase.auth
    }
    fun signinClicked(view: View) {

        val email = binding.emailText.text.toString()
        val password = binding.passwordText.text.toString()

        if(email.isNotEmpty() && password.isNotEmpty()) {
         auth.signInWithEmailAndPassword(email,password).addOnSuccessListener {
             val intent = Intent(this@OgrenciActivity,ogranaActivity::class.java)
             startActivity(intent)
         }.addOnFailureListener {
             Toast.makeText(this@OgrenciActivity,it.localizedMessage,Toast.LENGTH_LONG).show()
         }
        }
        else {
            Toast.makeText(this@OgrenciActivity,"Username? / Password?",Toast.LENGTH_LONG).show()

        }

    }
}