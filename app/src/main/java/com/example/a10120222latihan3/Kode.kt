package com.example.a10120222latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Kode : AppCompatActivity() {

    private lateinit var btnMasuk: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode)

        btnMasuk = findViewById(R.id.btn_masuk)
        btnMasuk.setOnClickListener{
            val intent = Intent(this, Input::class.java)
            startActivity(intent)
        }
    }
}