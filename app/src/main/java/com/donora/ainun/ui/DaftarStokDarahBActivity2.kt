package com.donora.ainun.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bagusrizki.ainun.R
import com.bagusrizki.ainun.databinding.ActivityDaftarStokDarahBactivity2Binding

class DaftarStokDarahBActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityDaftarStokDarahBactivity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDaftarStokDarahBactivity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val gol = intent.getStringExtra("GOL");

        if (gol == "B+") {
            binding.daftarstokdarah.text = "Daftar Stok Darah B+"
            binding.darah1.text = "50"
            binding.darah2.text = "20"
            binding.darah3.text = "50"
            binding.darah4.text = "80"
            binding.totalstokdarah.text="Total Stock Golongan Darah B+"
        } else if (gol == "A+") {
            binding.daftarstokdarah.text = "Daftar Stok Darah A+"
            binding.darah1.text = "70"
            binding.darah2.text = "90"
            binding.darah3.text = "50"
            binding.darah4.text = "20"
            binding.totalstokdarah.text="Total Stock Golongan Darah A+"
        } else if (gol == "AB+") {
            binding.daftarstokdarah.text = "Daftar Stok Darah AB+"
            binding.darah1.text = "30"
            binding.darah2.text = "50"
            binding.darah3.text = "50"
            binding.darah4.text = "10"
            binding.totalstokdarah.text="Total Stock Golongan Darah AB+"
        } else if (gol == "O+") {
            binding.daftarstokdarah.text = "Daftar Stok Darah O+"
            binding.darah1.text = "50"
            binding.darah2.text = "50"
            binding.darah3.text = "50"
            binding.darah4.text = "50"
            binding.totalstokdarah.text="Total Stock Golongan Darah O+"
        }

        binding.imageView3.setOnClickListener{
            val intent = Intent(this, UnitDonorDarahActivity::class.java)
            startActivity(intent)
        }

        binding.imageView7.setOnClickListener{
            val intent = Intent(this, UnitDonorDarahActivity::class.java)
            startActivity(intent)
        }
        binding.imageView8.setOnClickListener{
            val intent = Intent(this, UnitDonorDarahActivity::class.java)
            startActivity(intent)
        }
        binding.imageView9.setOnClickListener{
            val intent = Intent(this, UnitDonorDarahActivity::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}