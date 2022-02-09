package com.example.famaccscreens.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.famaccscreens.adapter.PagesAdapter
import com.example.famaccscreens.databinding.ActivityMainBinding
import com.example.famaccscreens.model.PageNames


class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setUpAdapter()

    }
    
    fun setUpAdapter() {
        val pageNames = listOf(PageNames("Name Classes"))
        val pagesAdapter = PagesAdapter(pageNames)
        binding.rvPages.adapter = pagesAdapter
    }

}