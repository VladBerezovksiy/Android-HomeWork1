package com.example.homework1

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    private var count = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val numberText: TextView = findViewById(R.id.number)
        val minusButton: Button = findViewById(R.id.decreaseButton)
        val plusButton: Button = findViewById(R.id.increaseButton)

        plusButton.setOnClickListener {
            count++
            Toast.makeText(this, "Count: $count", Toast.LENGTH_SHORT).show()
            numberText.setText("" + count)
        }

        minusButton.setOnClickListener {
            if (count > 1) {
                count--
                Toast.makeText(this, "Count: $count", Toast.LENGTH_SHORT).show()
                numberText.setText("" + count)
            } else {
                Toast.makeText(this, "Count cannot be less than 1", Toast.LENGTH_LONG).show()
            }
        }
    }

}