package com.gr.backoffice.common.entity.abs;

import com.gr.backoffice.common.entity.core.ProductTransactionsControlPack;

import java.util.Date;

public abstract class Product {
    private long id;
    private Organization productOrganization;
    private String productCode;
    private String productName;
    private Date validFrom;
    private Date validTo;
    private int status;
    private ProductTransactionsControlPack transactionControl;
    // TODO : add more entities below. it is incomplete yet.
}
