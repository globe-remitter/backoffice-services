package com.gr.backoffice.common.entity.core;

import com.gr.backoffice.common.entity.abs.Channel;
import com.gr.backoffice.common.entity.abs.Organization;

public class ProductTransactionControl {
    private long id;
    private String productControlCode;
    private TxnType productControlTxnType;
    private Organization productControlSource;
    private Organization productControlDestination;
    private Channel productControlChannel;
    private Currency productControlCurrency;
    private double productControlMinAmount;
    private double productControlMaxAmount;
}
