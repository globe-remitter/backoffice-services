package com.gr.backoffice.common.entity.enums;

public enum AddressType {
    MAILING(1), BILLING(2);

    private Integer order;

    AddressType(int order)
    {
        this.order = order;
    }

    public Integer getOrder() {
        return order;
    }
}
