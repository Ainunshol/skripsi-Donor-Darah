package com.donora.ainun

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bagusrizki.ainun.R
import com.bagusrizki.ainun.databinding.ActivityLoginBinding
import com.donora.ainun.admin.InputStokDarahActivity
import com.donora.ainun.ui.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvDaftar.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.masuk.setOnClickListener {
            val email = binding.username.text.toString()
            val password = binding.password.text.toString()

            if (email == "ainun@gmail.com" && password == "123") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                showErrorDialog()
            }
            if (email == "admin@gmail.com" && password == "123") {
                val intent = Intent(this, InputStokDarahActivity::class.java)
                startActivity(intent)
            } else {
                showErrorDialog()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun showErrorDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Login Error")
        builder.setMessage("Email atau kata sandi salah")
        builder.setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
        builder.show()
    }
}
