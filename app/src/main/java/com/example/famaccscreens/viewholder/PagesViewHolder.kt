package com.example.famaccscreens.viewholder

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.example.famaccscreens.view.NameClassesActivity
import com.example.famaccscreens.databinding.ItemPagesBinding
import com.example.famaccscreens.model.PageNames

class PagesViewHolder(private val binding:ItemPagesBinding ): RecyclerView.ViewHolder(binding.root) {

    fun bindData (pageNames:PageNames) {

        with(binding) {
            btnNameClasses.text = pageNames.name

            btnNameClasses.setOnClickListener {
                val context = root.context
                val intent = Intent(context, NameClassesActivity::class.java)
                intent.putExtra("key", btnNameClasses.text.toString())
                context.startActivity(intent)
            }
        }
    }
}