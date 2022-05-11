package com.kotonosora.dailytools

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotonosora.dailytools.databinding.ActivityTipComputerBinding
import java.text.NumberFormat
import kotlin.math.ceil

class TipComputer : AppCompatActivity() {

    private lateinit var binding: ActivityTipComputerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipComputerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        val stringInTextField: String = binding.costOfService.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        if (cost == null || cost == 0.0) {
            displayTip(0.0)
            return
        }
        val tipPercentage: Double = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip: Double = tipPercentage * cost
        if (binding.roundUpSwitch.isChecked) {
            tip = ceil(tip)
        }
        displayTip(tip)
    }

    private fun displayTip(tip: Double) {
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}