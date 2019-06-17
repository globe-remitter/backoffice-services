package com.gr.backoffice.common.entity;

import com.gr.backoffice.common.entity.abs.Organization;
import com.gr.backoffice.common.entity.common.Currency;
import com.gr.backoffice.common.entity.common.Product;
import com.gr.backoffice.common.entity.enums.AccountType;

public class DummyAccount {

    private int id;
    private Organization accountOrganization;
    private String accountName;
    protected AccountType accountType;
    private Currency accountCurrency;
    private String accountNumber;
    private String ibanNumber;
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

}
