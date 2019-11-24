package com.cenga.movieapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class activity_main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        private fun initUi(){
        button3.setOnClickListener{
            val email : String = editText.text.toString()
            val password= password.text.toString()
            saveUser(email, password)

        }
          Toast.makeText(this, "Email" $Email)

        }



        private fun saveUser(email: String, password: String){
            val preferences= getSharedPreferences("MovieApp", Context.MODE_PRIVATE)
            val editor= preferences.edit()
            editor.putString("email",email)
            editor.putString("password" password)
            editor.apply()

            val savedEmail= preference.getString("email", "default text")




        }


    }
}
