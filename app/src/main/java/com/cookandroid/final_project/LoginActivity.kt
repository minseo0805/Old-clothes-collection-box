package com.cookandroid.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        val joinBtn = findViewById<Button>(R.id.joinBtn)
        joinBtn.setOnClickListener{
            val intent = Intent(this,JoinActivity::class.java)
            startActivity(intent)
            Toast
                .makeText(this, "회원가입 화면으로 이동합니다.", Toast.LENGTH_SHORT)
                .show()


        }
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast
                .makeText(this, "로그인이 완료되었습니다.", Toast.LENGTH_SHORT)
                .show()
        }
    }
}