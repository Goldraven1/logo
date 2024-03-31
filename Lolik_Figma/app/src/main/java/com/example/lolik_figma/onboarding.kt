package com.example.lolik_figma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
    }

    fun login(view: View) {
        var activityActivityLoginIntent = Intent(this, ActivityLogin::class.java);
        startActivity(activityActivityLoginIntent);
    }

    fun register(view: View) {
        var activityActivityLoginIntent = Intent(this, ActivityLogin::class.java);
        startActivity(activityActivityLoginIntent);
    }
}