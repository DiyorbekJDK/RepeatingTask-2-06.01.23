package com.diyorbek.repeatingtask_2_060123

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.repeatingtask_2_060123.adapter.TeamAdapter
import com.diyorbek.repeatingtask_2_060123.model.Liga


class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "Details";  // provide compatibility to all the versions
        val colorDrawable = ColorDrawable(Color.parseColor("#FF000000"))
        actionBar?.setBackgroundDrawable(colorDrawable)
        val adapter2 = TeamAdapter()
        val img: ImageView = findViewById(R.id.img)
        val txt: TextView = findViewById(R.id.textView)
        val rv: RecyclerView = findViewById(R.id.reclerView)
        val liga = intent.getParcelableExtra<Liga>("liga")
        img.setImageResource(liga?.ligaImg!!)
        txt.text = liga.ligaName
        rv.apply {
            adapter = adapter2
            layoutManager = LinearLayoutManager(this@DetailActivity)
        }
        adapter2.submitList(liga.ligaTeam)
    }
}