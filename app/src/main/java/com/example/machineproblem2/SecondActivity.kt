package com.example.machineproblem2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    var showPass : Boolean = false
    lateinit var passwdView : TextView
    var passwdActual = " "
    var passwdMask = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_page)
        val intent = intent

        val nameView = findViewById<TextView>(R.id.nameView)
        val emailView = findViewById<TextView>(R.id.emailView)
        passwdView = findViewById<TextView>(R.id.passwdView)

        passwdActual = intent.getStringExtra("passwd").toString()
        var passwdActualLength = passwdActual.length
        showPass = false

        for(i in 1..passwdActualLength) passwdMask+="*"

        nameView.text = "Welcome\n" + (intent.getStringExtra("name"))
        emailView.text = "Email: " + (intent.getStringExtra("email"))
        passwdView.text = "Password: " + passwdMask
    }

    fun showPassword(view: View) {
        if(!showPass) {
            passwdView.text = "Password: " + passwdActual
            showPass = true
        }

        else {
            passwdView.text = "Password: "+ passwdMask
            showPass = false
        }
    }

    fun back(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}