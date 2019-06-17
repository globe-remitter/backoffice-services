package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.abs.Address;
import com.gr.backoffice.common.entity.enums.AddressType;

public class MailingAddress extends Address {

    public MailingAddress(AddressType addressType) {
        super(AddressType.MAILING);
    }
}
