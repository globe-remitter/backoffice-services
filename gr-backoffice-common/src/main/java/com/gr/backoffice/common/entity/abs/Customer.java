package com.gr.backoffice.common.entity.abs;

import com.gr.backoffice.common.entity.common.Country;
import com.gr.backoffice.common.entity.enums.CustomerType;

import java.util.Date;
import java.util.List;

public abstract class Customer {

    private int id;
    private String customerCode;
    private Organization customerOrganization;
    private List<Address> customerAddressList;
    private Country nationality;
    private Date customDob;
    private List<IdentityDocument> customerIdentityDocuments;
    private int languageCode;
    private int customerStatus;
    protected CustomerType customerType;

    public Customer(CustomerType customerType) {
        this.customerType = customerType;
    }
}
