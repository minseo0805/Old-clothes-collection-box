package com.cookandroid.final_project

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : AppCompatActivity() {
    private val OPEN_GALLERY = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        btnOpen.setOnClickListener { openGallery() }
        val BtnHome = findViewById<Button>(R.id.btnHome)
        val BtnMenu = findViewById<Button>(R.id.btnMenu)
        val regBtn = findViewById<Button>(R.id.reg_button)
        regBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast
                .makeText(this, "등록이 완료되었습니다.", Toast.LENGTH_SHORT)
                .show()
        }

        BtnHome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        BtnMenu.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
    private fun openGallery() {
        val intent: Intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.setType("image/*")
        startActivityForResult(intent, OPEN_GALLERY)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == OPEN_GALLERY) {
                var currentImageUrl: Uri? = data?.data

                try {
                    val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, currentImageUrl)
                    showImg.setImageBitmap(bitmap)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        } else {
            Log.d("ActivityResult", "something wrong")
        }

    }
}