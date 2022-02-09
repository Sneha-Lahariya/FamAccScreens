package com.example.famaccscreens.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.famaccscreens.databinding.ItemAccountsBinding
import com.example.famaccscreens.model.Accounts

public class AccountsViewHolder1(val binding:ItemAccountsBinding ): RecyclerView.ViewHolder(binding.root) ,View.OnClickListener{

    var selectedPosition = 0

    fun bindData(accounts: Accounts, dataset:List<Accounts>, position:Int) {
        with(binding) {
            val item = dataset[position]
            radioBtnAccounts.text = root.context.resources.getString(item.stringResourceId)
            binding.radioBtnAccounts.isChecked = (selectedPosition == adapterPosition)

        }
    }

    override fun onClick(p0: View?) {
        val previousPosition = selectedPosition
        selectedPosition = adapterPosition
    }

}