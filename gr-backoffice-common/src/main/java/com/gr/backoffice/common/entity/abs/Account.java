package com.gr.backoffice.common.entity.abs;

import com.gr.backoffice.common.entity.core.Currency;
import com.gr.backoffice.common.entity.enums.AccountType;

public class Account<T> {

    private int id;
    private Organization accountOrganization;
    private String accountName;
    protected AccountType accountType;
    private Currency accountCurrency;
    private String accountNumber;
    private String ibanNumber;
    private T accountHolder;
    private double currentBalance;
    private double accountLimit;
    private int accountStatus;
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Account(AccountType accountType) {
        this.accountType = accountType;
    }
}
