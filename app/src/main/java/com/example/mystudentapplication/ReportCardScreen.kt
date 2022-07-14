package com.example.mystudentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ReportCardScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_card_screen)

        var backButton: Button

        backButton= findViewById(R.id.back_button)

        backButton.setOnClickListener(MainActivity::class.java)
    }
}