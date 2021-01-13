package com.diego.cardapiorestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        var sucos = actSucos

        sucos.setOnClickListener {
            var intent = Intent( this, Sucos::class.java)
            startActivity(intent)
            finish()
        }
    }
}