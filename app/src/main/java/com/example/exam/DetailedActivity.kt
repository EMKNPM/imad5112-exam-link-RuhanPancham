package com.example.exam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Detailed View Screen for "Campsite Commander".
 * Requirement: Button to display the full list of gear with details: Item, Category, Quantity, and specific Notes/Comments.
 */
class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Requirement: Well-designed layout for all screens.
        // References activity_detailed.xml which follows the nature-themed palette.
        setContentView(R.layout.activity_detailed)

        val txtDetails = findViewById<TextView>(R.id.txtDetails)
        val btnBack = findViewById<Button>(R.id.btnBack)

        var output = ""

        // Requirement: Use parallel arrays to store item details effectively.
        // Requirement: Use a loop to iterate through the data to display the full list.
        // Accessing the static arrays from MainActivity companion object to ensure data consistency.
        for (i in MainActivity.itemNames.indices) {
            output += "⛺ Item: ${MainActivity.itemNames[i]}\n"
            output += "📂 Category: ${MainActivity.categories[i]}\n"
            output += "🔢 Quantity: ${MainActivity.quantities[i]}\n"
            output += "💬 Notes: ${MainActivity.comments[i]}\n"
            output += "--------------------------------------\n\n"
        }

        // Displaying the checklist. Provides feedback if the list is empty.
        txtDetails.text = if (output.isEmpty()) "Base camp is currently empty. Add gear to start your adventure!" else output

        // Requirement: Implement a "Back to Base" button (Navigation) to return to the Main Screen.
        btnBack.setOnClickListener {
            finish()
        }
    }
}
