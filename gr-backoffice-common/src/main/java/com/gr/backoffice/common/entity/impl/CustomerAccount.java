package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.abs.Account;
import com.gr.backoffice.common.entity.abs.Customer;
import com.gr.backoffice.common.entity.enums.AccountType;

public class CustomerAccount extends Account<Customer> {
    public CustomerAccount(AccountType accountType) {
        super(accountType);
        if(accountType!=AccountType.CUSTOMER)
        {
            throw new UnsupportedOperationException("Unsupported accountType"+accountType);
        }
    }
}
