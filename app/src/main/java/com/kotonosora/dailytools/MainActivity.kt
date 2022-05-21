package com.kotonosora.dailytools

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kotonosora.dailytools.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDiceRoller.setOnClickListener {
            val intent = Intent(this, DiceRollerActivity::class.java)
            startActivity(intent)
        }

        binding.btnBirthday.setOnClickListener {
            val intent = Intent(this, BirthdayCardActivity::class.java)
            startActivity(intent)
        }

        binding.btnLemonade.setOnClickListener {
            val intent = Intent(this, LemonadeActivity::class.java)
            startActivity(intent)
        }

        binding.btnTipComputer.setOnClickListener {
            val intent = Intent(this, TipComputerActivity::class.java)
            startActivity(intent)
        }

        binding.btnAffirmations.setOnClickListener {
            val intent = Intent(this, AffirmationActivity::class.java)
            startActivity(intent)
        }

        binding.btnDog.setOnClickListener {
            val intent = Intent(this, DogglerActivity::class.java)
            startActivity(intent)
        }

        binding.btnWords.setOnClickListener {
            val intent = Intent(this, WordsActivity::class.java)
            startActivity(intent)
        }

        binding.btnDessert.setOnClickListener {
            val intent = Intent(this, DessertActivity::class.java)
            startActivity(intent)
        }

        binding.btnUnscramble.setOnClickListener {
            val intent = Intent(this, UnscrambleActivity::class.java)
            startActivity(intent)
        }

        binding.btnCupcake.setOnClickListener {
            val intent = Intent(this, CupcakeActivity::class.java)
            startActivity(intent)
        }

        binding.btnMarsPhotos.setOnClickListener {
            val intent = Intent(this, MarsPhotosActivity::class.java)
            startActivity(intent)
        }

        binding.btnBusSchedule.setOnClickListener {
            val intent = Intent(this, BusScheduleActivity::class.java)
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
