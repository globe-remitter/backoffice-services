package com.gr.backoffice.common.entity.common;

import com.gr.backoffice.common.entity.abs.Organization;

import java.util.Date;
import java.util.List;

public class PostingPack {

    private long id;
    private Organization postingPackOrganization;
    private String postingPackCode;
    private List<PostingRule> postingPackRules;
    private Date lastUpdatedAt;

}
