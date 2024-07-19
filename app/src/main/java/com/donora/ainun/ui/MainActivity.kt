package com.donora.ainun.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bagusrizki.ainun.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.menuUnitDonorDarah.setOnClickListener {
            val intent = Intent(this, UnitDonorDarahActivity::class.java)
            startActivity(intent)
        }

        binding.menuLokasiDonor.setOnClickListener {
            val intent = Intent(this, LokasiDonorDarahActivity::class.java)
            startActivity(intent)
        }

        binding.menuArtikel.setOnClickListener {
            val intent = Intent(this, ArtikelActivity::class.java)
            startActivity(intent)
        }

        binding.menuInformasi.setOnClickListener {
            val intent = Intent(this, InformasiActivity::class.java)
            startActivity(intent)
        }

        binding.menuStokDarah.setOnClickListener {
            val intent = Intent(this, CekStokDarahActivity::class.java)
            startActivity(intent)
        }

        binding.menuRiwayat.setOnClickListener {
            val intent = Intent(this, RiwayatActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
