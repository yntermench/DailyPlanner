package com.example.dailyplanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Pattern

class SingIn : AppCompatActivity() {
    lateinit var  mail:EditText
    lateinit var  pass:EditText

    val pattern=("[a-z]{1,100}" + "@" + "[a-z]{1,6}" + "\\.+" + "[a-z]{1,3}")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)
        mail=findViewById(R.id.email)
        pass=findViewById(R.id.password)
    }
    fun emailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()
    }

    fun next(view: View) {
        if (mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()){
            if (emailValid(mail.text.toString())){
                val intent = Intent(this@SingIn, ProfileActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this, "ошибка при заполнении поля email", Toast.LENGTH_SHORT).show()
            }
        }
        else{
            Toast.makeText(this, "заполните текстовые поля", Toast.LENGTH_SHORT).show()
        }
    }
}