package com.cookandroid.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BtnHome = findViewById<Button>(R.id.btnHome)
        val BtnMenu = findViewById<Button>(R.id.btnMenu)
        val BtnPost = findViewById<Button>(R.id.btnPost)
        val BtnPic1 = findViewById<Button>(R.id.btnPic1)
        val BtnPic2 = findViewById<Button>(R.id.btnPic2)
        val BtnPic3 = findViewById<Button>(R.id.btnPic3)
        val BtnPic4 = findViewById<Button>(R.id.btnPic4)

        BtnHome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        BtnMenu.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        BtnPost.setOnClickListener{
            val intent = Intent(this, PostActivity::class.java);
            startActivity(intent)
        }

        btnPic1.setOnClickListener{
            val intent = Intent(this,ContentsActivity::class.java)
            intent.putExtra("page",1)
            startActivity(intent)
        }
       btnPic2.setOnClickListener{
            val intent = Intent(this,ContentsActivity::class.java)
           intent.putExtra("page",2)
            startActivity(intent)
        }
        btnPic3.setOnClickListener{
            val intent = Intent(this,ContentsActivity::class.java)
            intent.putExtra("page",3)
            startActivity(intent)
        }
        btnPic4.setOnClickListener{
            val intent = Intent(this,ContentsActivity::class.java)
            intent.putExtra("page",4)
            startActivity(intent)
        }
    }
}
