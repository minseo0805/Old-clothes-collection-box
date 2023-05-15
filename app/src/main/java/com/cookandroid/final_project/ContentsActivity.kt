package com.cookandroid.final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

class ContentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contents)
        val rcvBtn = findViewById<Button>(R.id.rcvBtn)
        val TitleTv = findViewById<TextView>(R.id.titleTv)
        val DateTv = findViewById<TextView>(R.id.dateTv)
        val DeadLine = findViewById<TextView>(R.id.deadLine)
        val ImgCloth = findViewById<ImageView>(R.id.imgCloth)
        val CommentCloth = findViewById<TextView>(R.id.commentCloth)
        val LocationTv = findViewById<TextView>(R.id.locationTv)

        val currentDate = Calendar.getInstance()
        val df = SimpleDateFormat("yyyy-MM-dd")
        currentDate.time = Date()

        val page = intent.getIntExtra("page",0)

        if (page == 1) {
            TitleTv.setText("파란색 셔츠")
            DateTv.setText("${df.format(currentDate.time)}")
            currentDate.add(Calendar.DATE, 7)
            ImgCloth.setImageResource(R.drawable.shirt)
            LocationTv.setText("S3-D5-03-11")
            CommentCloth.setText("대충 이 옷 사이즈같은 정보랑 거의 새 것 같아서 굉장히 추천 한다는 설명")
            DeadLine.setText("글 삭제 예정일: ${df.format(currentDate.time)}")
        }
        if (page == 2) {
            TitleTv.setText("크림 반바지")
            DateTv.setText("${df.format(currentDate.time)}")
            currentDate.add(Calendar.DATE, 7)
            ImgCloth.setImageResource(R.drawable.pants)
            LocationTv.setText("G4-S9-04-07")
            CommentCloth.setText("대충 바지 산지 얼마 안 되었지만 안타까운 사정으로 나눔 한다는 글")
            DeadLine.setText("글 삭제 예정일: ${df.format(currentDate.time)}")
        }
        if (page == 3) {
            TitleTv.setText("슬리퍼")
            DateTv.setText("${df.format(currentDate.time)}")
            currentDate.add(Calendar.DATE, 7)
            ImgCloth.setImageResource(R.drawable.shoes)
            LocationTv.setText("C7-Y2-02-09")
            CommentCloth.setText("깨끗하게 신었는데 가져갈사람 없나 냄새안나요 진짜루 대충 사이즈 몇이에요")
            DeadLine.setText("글 삭제 예정일: ${df.format(currentDate.time)}")
        }
        if (page == 4) {
            TitleTv.setText("빨간 모자")
            DateTv.setText("${df.format(currentDate.time)}")
            currentDate.add(Calendar.DATE, 7)
            ImgCloth.setImageResource(R.drawable.hat)
            LocationTv.setText("J6-G3-03-15")
            CommentCloth.setText("이거 진짜 새건데 정말 새건데 진짜 좋은건데 가져갈사람 없나")
            DeadLine.setText("글 삭제 예정일: ${df.format(currentDate.time)}")
        }

        rcvBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast
                .makeText(this, "수령 신청이 완료되었습니다.", Toast.LENGTH_SHORT)
                .show()
        }
        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}