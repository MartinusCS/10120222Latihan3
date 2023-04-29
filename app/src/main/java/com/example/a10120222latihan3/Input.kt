package com.example.a10120222latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Input : AppCompatActivity() {

    private lateinit var btnSelanjutnya: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        btnSelanjutnya = findViewById(R.id.btn_selanjutnya)
        btnSelanjutnya.setOnClickListener {

            val Input = findViewById<EditText>(R.id.txt_edit).text.toString()
            val intent = Intent(this, validasi::class.java)
            intent.putExtra("txt_edit", Input)
            startActivity(intent)

        }
    }
}