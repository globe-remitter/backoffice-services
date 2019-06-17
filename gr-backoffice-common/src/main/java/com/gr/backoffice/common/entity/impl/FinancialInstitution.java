package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.enums.OrganizationType;
import com.gr.backoffice.common.entity.abs.Organization;

public class FinancialInstitution extends Organization {
    private String swiftCode;
    private String institutionCode;

    public FinancialInstitution(OrganizationType organizationTypeInput) {
        super(organizationTypeInput);
       if(organizationTypeInput != OrganizationType.FINANCIAL_INSTITUTION)
        {
            throw  new IllegalStateException("Unsupported organizationType: "+ organizationTypeInput);
        }
    }
}
