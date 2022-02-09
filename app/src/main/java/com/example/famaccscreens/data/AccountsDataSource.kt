package com.example.famaccscreens.data

import com.example.famaccscreens.R
import com.example.famaccscreens.model.Accounts

class AccountsDataSource {
    fun loadAccounts() : List<Accounts> {
        return listOf(
            Accounts(R.string.name1_cody),
            Accounts(R.string.name2_jac),
            Accounts(R.string.name3_lirael)
        )
    }
}