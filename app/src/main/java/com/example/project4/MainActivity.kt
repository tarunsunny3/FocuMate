package com.example.project4


import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val appUsageTrackingBtn: Button = findViewById(R.id.appUsageTrackingBtn)
        appUsageTrackingBtn.setOnClickListener {
            startActivity(Intent(this, AppTrackUsage::class.java))
        }


        val addLocationsScreen: Button = findViewById(R.id.addLocationsScreenBtn)

        addLocationsScreen.setOnClickListener {
            startActivity(Intent(this, AddLocationActivity::class.java))
        }
    }
}
