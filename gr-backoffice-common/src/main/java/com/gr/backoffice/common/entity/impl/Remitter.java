package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.abs.Customer;
import com.gr.backoffice.common.entity.enums.CustomerType;

public class Remitter extends Customer {
    public Remitter(CustomerType customerType) {
        super(customerType);
        if (customerType != CustomerType.REMITTER) {
            throw new IllegalStateException("Unsupported customerType" + customerType);
        }
    }
}
