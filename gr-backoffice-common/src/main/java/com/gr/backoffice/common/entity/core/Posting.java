package com.gr.backoffice.common.entity.core;

import com.gr.backoffice.common.entity.abs.Account;
import com.gr.backoffice.common.entity.abs.Organization;
import com.gr.backoffice.common.entity.abs.Transaction;

import java.util.Date;

public class Posting {

    private long id;
    private Organization organization;
    private Currency postingCurrency;
    private Transaction postingTransaction;
    private Date postingDate;
    private Date valueDate;
    private double amount;
    private Account debitAccount;
    private Account creditAccount;
    private int status;


}
