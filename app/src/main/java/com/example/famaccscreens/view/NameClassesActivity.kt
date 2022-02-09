package com.example.famaccscreens.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.famaccscreens.databinding.ActivityNameClassesBinding

class NameClassesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNameClassesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNameClassesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rightArrow.setOnClickListener{
            val intent = Intent(this@NameClassesActivity, SelectAccount::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
        }
    }
}