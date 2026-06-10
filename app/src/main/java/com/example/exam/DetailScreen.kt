package com.example.exam

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class DetailScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_screen)

        val edtItem = findViewById<EditText>(R.id.edtItem)
        val edtCategory = findViewById<EditText>(R.id.edtCategory)
        val edtQuantity = findViewById<EditText>(R.id.edtQuantity)
        val edtComment = findViewById<EditText>(R.id.edtComment)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val item = edtItem.text.toString().trim()
            val category = edtCategory.text.toString().trim()
            val quantityText = edtQuantity.text.toString().trim()
            val comment = edtComment.text.toString().trim()

            // Error Handling: Ensure that the app handles input errors
            if (item.isEmpty() || category.isEmpty() || quantityText.isEmpty() || comment.isEmpty()) {
                Toast.makeText(this, "Please complete all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            try {
                val quantity = quantityText.toInt()

                // Data Storage: Use parallel arrays to store item details
                MainActivity.itemNames.add(item)
                MainActivity.categories.add(category)
                MainActivity.quantities.add(quantity)
                MainActivity.comments.add(comment)

                Toast.makeText(this, "Gear added to pack!", Toast.LENGTH_SHORT).show()
                finish() // Navigation: Return to previous screen

            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Quantity must be a valid number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
