package com.cookandroid.final_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)


        val cancelBtn = findViewById<Button>(R.id.cancelBtn)
        cancelBtn.setOnClickListener{
            finish()
            Toast
                .makeText(this, "취소하여 로그인화면으로 돌아갑니다.", Toast.LENGTH_SHORT)
                .show()
        }
        val signupBtn = findViewById<Button>(R.id.signupBtn)
        signupBtn.setOnClickListener{
            finish()
            Toast
                .makeText(this, "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT)
                .show()
        }
    }
}