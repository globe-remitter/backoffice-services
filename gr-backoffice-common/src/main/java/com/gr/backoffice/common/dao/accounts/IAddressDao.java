package com.gr.backoffice.common.dao.accounts;

import com.gr.backoffice.common.entity.abs.Address;

import java.util.List;

public interface IAddressDao extends IDaoOperations<Address> {
    @Override
    int save(Address address);

    @Override
    int update(Address address);

    @Override
    Address getOne(int id);

    @Override
    Address getOne(String id);

    @Override
    List<Address> getAll();

    @Override
    int delete(int id);

    @Override
    int delete(String id);

    @Override
    int updateStatus(int id, boolean status);

    @Override
    int updateStatus(String id, boolean status);
}
