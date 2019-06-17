package com.gr.backoffice.common.entity.abs;

import com.gr.backoffice.common.entity.enums.AddressType;
import com.gr.backoffice.common.entity.common.City;
import com.gr.backoffice.common.entity.common.Country;
import com.gr.backoffice.common.entity.common.State;

public abstract class Address implements Comparable<Address> {
    private String owner;
    private String poBox;
    private String unitName;
    private String streetName;
    private City city;
    private State state;
    private Country country;
    private AddressType addressType;

    public Address(AddressType addressType)
    {
        this.addressType = addressType;
    }

    @Override
    public int compareTo(Address o) {
       return this.addressType.getOrder().compareTo(o.addressType.getOrder());
    }
}
