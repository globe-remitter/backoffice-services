package com.gr.backoffice.common.entity.core;

import com.gr.backoffice.common.entity.abs.Account;
import com.gr.backoffice.common.entity.abs.Address;
import com.gr.backoffice.common.entity.abs.Customer;

public class Beneficiary {
    private int id;
    private Customer beneficiaryOwner;
    private String benName;
    private String benMobile;
    private String benEmail;
    private Address benAddress;
    private Account benBankAccount;
    private boolean isActive;
}
