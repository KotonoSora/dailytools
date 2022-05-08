package com.kotonosora.dailytools

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_dice_roller)
        rollButton.setOnClickListener {
            val intent = Intent(this, DiceRoller::class.java)
            startActivity(intent)
        }

        val birthdayCard: Button = findViewById(R.id.btn_birthday)
        birthdayCard.setOnClickListener {
            val intent = Intent(this, BirthdayCard::class.java)
            startActivity(intent)
        }

        val lemonade: Button = findViewById(R.id.btn_lemonade)
        lemonade.setOnClickListener {
            val intent = Intent(this, Lemonade::class.java)
            startActivity(intent)
        }

        logging()
    }

    private fun logging() {
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}