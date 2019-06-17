package com.gr.backoffice.common.dao;

import com.gr.backoffice.common.entity.DummyAccount;

import java.util.List;

public interface IAccountDao {
    public DummyAccount save(DummyAccount dummyAccount);
    public DummyAccount get(Integer id);
    public List<DummyAccount> getAllAccounts();
    public int update(DummyAccount dummyAccount);
    public int delete(Integer id);
}
