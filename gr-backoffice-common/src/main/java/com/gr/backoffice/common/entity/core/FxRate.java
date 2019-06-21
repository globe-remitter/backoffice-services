package com.gr.backoffice.common.entity.core;

import java.util.Date;

public class FxRate {

    private long id;
    private String fxSource;
    private Date fxDate;
    private Currency fxBuyCurrency;
    private Currency fxSellCurrency;
    private float fxBuyRate;
    private float fxSellRate;
    private Date lastUpdatedAt;

}
