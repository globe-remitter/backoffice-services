package com.gr.backoffice.common.dao.accounts;

import com.gr.backoffice.common.entity.abs.Organization;

import java.util.List;

public interface IOrganizationDao extends IDaoOperations<Organization> {
    @Override
    int save(Organization organization);

    @Override
    int update(Organization organization);

    @Override
    Organization getOne(int id);

    @Override
    Organization getOne(String id);

    @Override
    List<Organization> getAll();

    @Override
    int delete(int id);

    @Override
    int delete(String id);

    @Override
    int updateStatus(int id, boolean status);

    @Override
    int updateStatus(String id, boolean status);
}
