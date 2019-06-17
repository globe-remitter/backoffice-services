package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.abs.Address;
import com.gr.backoffice.common.entity.enums.AddressType;

public class BillingAddress extends Address {
    public BillingAddress(AddressType addressType) {
        super(AddressType.BILLING);
    }
}
