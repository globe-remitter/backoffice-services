package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.enums.OrganizationType;
import com.gr.backoffice.common.entity.abs.Organization;

public class ExchangeHouse extends Organization {
    public ExchangeHouse(OrganizationType organizationTypeInput) {
        super(organizationTypeInput);
        if(organizationTypeInput != OrganizationType.EXCHANGE_HOUSE)
        {
            throw  new IllegalStateException("Unsupported organizationType: "+ organizationTypeInput);
        }
    }
}
