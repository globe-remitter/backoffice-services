package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.abs.Account;
import com.gr.backoffice.common.entity.enums.AccountType;

public class NostroAccount extends Account<FinancialInstitution> {

    public NostroAccount(AccountType accountType) {
        super(accountType);
        if(accountType!=AccountType.NOSTRO)
        {
            throw new UnsupportedOperationException("Unsupported accountType"+accountType);
        }
    }
}
