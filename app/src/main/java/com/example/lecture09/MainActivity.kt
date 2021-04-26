package com.example.lecture09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kanwal_laptop.lecture09_kotlin.myCustomAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userData : ArrayList<String> = ArrayList()
        for(i in 1..100){
            userData.add("Users : "+i)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myCustomAdapter(this, userData)


    }

    fun onNextBtnPressed(view: View) {
        val recyclerAdvanceIntent: Intent = Intent(this, RecyclerAdvance ::class.java )
        startActivity(recyclerAdvanceIntent)

    }
}