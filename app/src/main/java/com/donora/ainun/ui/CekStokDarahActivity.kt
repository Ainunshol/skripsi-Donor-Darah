package com.donora.ainun.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bagusrizki.ainun.R
import com.bagusrizki.ainun.databinding.ActivityCekStokDarahBinding

class CekStokDarahActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCekStokDarahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCekStokDarahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView13.setOnClickListener(){
            val intent = Intent(this, DaftarStokDarahBActivity2::class.java)
            intent.putExtra("GOL", "B+")
            startActivity(intent)
        }
        binding.imageView8.setOnClickListener(){
            val intent = Intent(this, DaftarStokDarahBActivity2::class.java)
            intent.putExtra("GOL", "A+")
            startActivity(intent)
        }
        binding.imageView10.setOnClickListener(){
            val intent = Intent(this, DaftarStokDarahBActivity2::class.java)
            intent.putExtra("GOL", "O+")
            startActivity(intent)
        }
        binding.imageView11.setOnClickListener() {
            val intent = Intent(this, DaftarStokDarahBActivity2::class.java)
            intent.putExtra("GOL", "AB+")
            startActivity(intent)
        }

        // Set up toolbar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}