package com.example.machineproblem2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view: View) {
        var nameBox = findViewById<EditText>(R.id.nameBox).text.toString()
        var emailBox = findViewById<EditText>(R.id.emailBox).text.toString()
        var passBox = findViewById<EditText>(R.id.passBox).text.toString()

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("name", nameBox)
        intent.putExtra("email", emailBox)
        intent.putExtra("passwd", passBox)

        startActivity(intent)
    }
}