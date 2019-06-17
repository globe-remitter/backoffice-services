package com.gr.backoffice.common.entity.abs;

import com.gr.backoffice.common.entity.common.Country;
import com.gr.backoffice.common.entity.enums.OrganizationType;

import java.util.List;
import java.util.Set;

public abstract class Organization {
    private int id;
    private String orgName;
    private String orgCode;
    private Country country; // regdCountry
    private List<Address> address;
    private Set<String> phoneNumber;
    private int timeZone;
    private int orgStatus;
    protected OrganizationType organizationType;

    public Organization(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }
}
