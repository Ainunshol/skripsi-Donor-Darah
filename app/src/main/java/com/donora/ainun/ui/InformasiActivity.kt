package com.donora.ainun.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bagusrizki.ainun.R
import com.bagusrizki.ainun.databinding.ActivityInformasiBinding
import com.bagusrizki.ainun.databinding.ActivityMainBinding

class InformasiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInformasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up toolbar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)


        binding.lihatdetail1.setOnClickListener {
            val intent = Intent(this, DetailSyaratDonorActivity::class.java)
            startActivity(intent)
        }

        binding.lihatdetail2.setOnClickListener {
            val intent = Intent(this, DetailSyaratDonorActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
