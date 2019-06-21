package com.gr.backoffice.common.entity.core;

import com.gr.backoffice.common.entity.abs.Account;
import com.gr.backoffice.common.entity.abs.Channel;
import com.gr.backoffice.common.entity.abs.Organization;

import java.util.Date;

public class PostingRule {

    private long id;
    private String postingRuleCode;
    private TxnType productRuleTxnType;
    private Organization productRuleSource;
    private Organization productRuleDestination;
    private Channel productRuleChannel;
    private Currency productRuleCurrency;
    private Account productDebitAccount;
    private Account productCreditAccount;
    private Date lastUpdatedAt;

}
