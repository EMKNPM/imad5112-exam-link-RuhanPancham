package com.example.exam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Data Storage: Use parallel arrays to store item details
    companion object {
        val itemNames = arrayListOf("Tent", "Marshmallows", "Flashlight")
        val categories = arrayListOf("Shelter", "Food", "Safety")
        val quantities = arrayListOf(1, 3, 2)
        val comments = arrayListOf("4-person waterproof", "For S'mores (Mega size)", "Check batteries (AA)")
    }

    private lateinit var txtTotalItems: TextView
    private lateinit var btnAddGear: Button
    private lateinit var btnViewGear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Main Screen: Nature-themed color palette is applied in activity_main.xml
        setContentView(R.layout.activity_main)

        txtTotalItems = findViewById(R.id.txtTotalItems)
        btnAddGear = findViewById(R.id.btnAddGear)
        btnViewGear = findViewById(R.id.btnViewGear)

        // Navigation: Navigate to Add Gear Screen
        btnAddGear.setOnClickListener {
            val intent = Intent(this, DetailScreen::class.java)
            startActivity(intent)
        }

        // Navigation: Navigate to Detailed View Screen
        btnViewGear.setOnClickListener {
            val intent = Intent(this, DetailedActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        // Functionality: Use a loop to calculate the total number of items
        var total = 0
        for (qty in quantities) {
            total += qty
        }
        txtTotalItems.text = "Total Items Packed: $total"
    }
}
