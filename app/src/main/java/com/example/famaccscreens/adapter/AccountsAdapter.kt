package com.example.famaccscreens.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.famaccscreens.databinding.ItemAccountsBinding
import com.example.famaccscreens.model.Accounts

class AccountsAdapter(private val accounts: List<Accounts>): RecyclerView.Adapter<AccountsAdapter.AccountsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountsViewHolder {
        val binding =
            ItemAccountsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AccountsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AccountsViewHolder, position: Int) {
        holder.bindData(accounts[position], accounts, position)

    }

    override fun getItemCount(): Int {
        return accounts.size
    }


    inner class AccountsViewHolder(val binding: ItemAccountsBinding) :
        RecyclerView.ViewHolder(binding.root),
        View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        var selectedPosition = 0

        fun bindData(accounts: Accounts, dataset: List<Accounts>, position: Int) {
            with(binding) {
                val item = dataset[position]
                radioBtnAccounts.text = root.context.resources.getString(item.stringResourceId)
                binding.radioBtnAccounts.isChecked = selectedPosition == adapterPosition


            }
        }

        override fun onClick(p0: View?) {
            val previousPosition = selectedPosition
            selectedPosition = adapterPosition
            notifyItemChanged(selectedPosition)
            notifyItemChanged(previousPosition)
        }
    }
}