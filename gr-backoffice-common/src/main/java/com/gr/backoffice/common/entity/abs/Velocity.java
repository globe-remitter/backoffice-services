package com.gr.backoffice.common.entity.abs;

import com.gr.backoffice.common.entity.core.TxnType;

public class Velocity {
    private long id;
    private TxnType txnType;
    private String txnPeriodType;
    private int timePeriod;
    private double txnMaxAmount;
    private int txnMaxNo;
}
