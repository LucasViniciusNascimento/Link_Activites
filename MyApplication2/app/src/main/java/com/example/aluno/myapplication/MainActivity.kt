package com.example.aluno.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin : Button = findViewById<Button>(R.id.login)

        btLogin.setOnClickListener(View.OnClickListener {
            val textViewLogin: TextView = findViewById<TextView>(R.id.userName) as TextView
            val textViewSenha: TextView = findViewById<TextView>(R.id.password) as TextView

            val loginResult: Boolean = AppStaticServices.login(
                textViewLogin.text.toString(),
                textViewSenha.text.toString())

            if( loginResult == true ){
                toast("Login bem Sucedido")
            }else{
                toast("Login/Senha Inválidos")
            }
        })
    }

}
