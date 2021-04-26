package com.example.lecture09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_definitions.*

class definitionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_definitions)

        val wordReceived = intent.getStringExtra("word")
        val definitionReceived = intent.getStringExtra("definition")

        wordTextView.text = wordReceived
        definitionOfWord.text = definitionReceived

    }
}