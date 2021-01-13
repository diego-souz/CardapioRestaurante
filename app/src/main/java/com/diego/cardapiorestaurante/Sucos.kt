package com.diego.cardapiorestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Sucos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucos)
        supportActionBar!!.hide()
    }
}