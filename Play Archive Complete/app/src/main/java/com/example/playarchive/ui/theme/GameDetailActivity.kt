package com.example.playarchive

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.playarchive.ui.theme.MainActivity

class GameDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_game1)

        val gameTitle = intent.getStringExtra("GAME_TITLE")


    }
}
