package com.donora.ainun.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bagusrizki.ainun.R
import com.bagusrizki.ainun.databinding.ActivityRiwayatBinding

class RiwayatActivity : AppCompatActivity() {


    private lateinit var binding :ActivityRiwayatBinding
    private lateinit var riwayatAdapter: RiwayatAdapter
    private val riwayatList = mutableListOf<ItemRiwayatActivity.RiwayatItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRiwayatBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Setup RecyclerView
        riwayatAdapter = RiwayatAdapter(riwayatList) { position ->
            onTrashIconClick(position)
        }
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = riwayatAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Add some dummy data (replace this with your actual data loading logic)
        riwayatList.add(
            ItemRiwayatActivity.RiwayatItem(
                "UTD PMI Kabupaten Bantul",
                "Jl. Jend. Sudirman No.1, Babadan, Bantul",
                "Kamis, 11 Januari 2024"
            )
        )
        riwayatList.add(
            ItemRiwayatActivity.RiwayatItem(
                "RS Panembahan Senopati Bantul",
                "Jl Dr. Wahidin Sudiro Husodo Bantul",
                "Senin, 20 April 2024"
            )
        )
        // Set up toolbar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

    }

    // Function to handle click on trash icon
    private fun onTrashIconClick(position: Int) {
        // Remove item from the list
        riwayatList.removeAt(position)
        // Notify adapter that item is removed
        riwayatAdapter.notifyItemRemoved(position)
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
