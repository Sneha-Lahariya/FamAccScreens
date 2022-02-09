package com.example.famaccscreens.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.famaccscreens.adapter.AccountsAdapter
import com.example.famaccscreens.data.AccountsDataSource
import com.example.famaccscreens.databinding.ActivitySelectAccountBinding

class SelectAccount : AppCompatActivity() {

    private lateinit var binding:ActivitySelectAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpAdapter()
    }

    private fun setUpAdapter() {
        val myDataset = AccountsDataSource().loadAccounts()
        val accountsAdapter = AccountsAdapter(myDataset)
        binding.rvAccounts.adapter = accountsAdapter
    }

}