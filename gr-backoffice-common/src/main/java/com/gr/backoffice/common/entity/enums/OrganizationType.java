package com.gr.backoffice.common.entity.enums;

public enum OrganizationType {
    FINANCIAL_INSTITUTION("FI"), EXCHANGE_HOUSE("EH");

    private String type;

    OrganizationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
