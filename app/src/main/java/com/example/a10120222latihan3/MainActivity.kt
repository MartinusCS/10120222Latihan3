package com.example.a10120222latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnMulai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMulai = findViewById(R.id.btn_mulai)
        btnMulai.setOnClickListener{
            val intent = Intent(this, Kode::class.java)
            startActivity(intent)
        }
    }

    fun onClickMyButton(view: View) {}
}
