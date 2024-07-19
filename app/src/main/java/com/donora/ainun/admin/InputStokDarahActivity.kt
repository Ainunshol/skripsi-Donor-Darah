package com.donora.ainun.admin

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.bagusrizki.ainun.R
import com.bagusrizki.ainun.databinding.ActivityInputStokDarahBinding
import com.donora.ainun.ui.DaftarStokDarahBActivity2

class InputStokDarahActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInputStokDarahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputStokDarahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // List of blood types
        val bloodTypes = listOf("A+", "B+", "AB+", "O+")

        // Adapter for the spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, bloodTypes)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Set the adapter to the spinner
        binding.spinnerBloodType.adapter = adapter

        binding.btnSubmit.setOnClickListener {
            // Get the selected blood type
            val selectedBloodType = binding.spinnerBloodType.selectedItem.toString()

            // Create an intent to navigate to DaftarStokDarahBActivity2
            val intent = Intent(this, DaftarStokDarahBActivity2::class.java).apply {
                putExtra("GOL", selectedBloodType)
            }
            startActivity(intent)
        }
    }
}
