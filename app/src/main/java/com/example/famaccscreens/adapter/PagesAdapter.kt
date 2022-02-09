package com.example.famaccscreens.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.famaccscreens.databinding.ItemPagesBinding
import com.example.famaccscreens.model.PageNames
import com.example.famaccscreens.viewholder.PagesViewHolder

class PagesAdapter(private val pageNames: List<PageNames>): RecyclerView.Adapter<PagesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagesViewHolder {
        val binding = ItemPagesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PagesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PagesViewHolder, position: Int) {
        holder.bindData(pageNames[position])
    }

    override fun getItemCount(): Int {
        return pageNames.size
    }

}