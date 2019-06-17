package com.gr.backoffice.common.dao.accounts;

import com.gr.backoffice.common.entity.common.Country;

import java.util.List;

public interface ICountryDao extends IDaoOperations<Country> {
    @Override
    int save(Country country);

    @Override
    int update(Country country);

    @Override
    Country getOne(int id);

    @Override
    Country getOne(String id);

    @Override
    List<Country> getAll();

    @Override
    int delete(int id);

    @Override
    int delete(String id);

    @Override
    int updateStatus(int id, boolean status);

    @Override
    int updateStatus(String id, boolean status);
}
