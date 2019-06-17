package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.abs.Account;
import com.gr.backoffice.common.entity.enums.AccountType;

public class GL_Account extends Account<FinancialInstitution> {
    public GL_Account(AccountType accountType) {
        super(accountType);
        if(accountType!=AccountType.GL)
        {
            throw new UnsupportedOperationException("Unsupported accountType"+accountType);
        }
    }
}
