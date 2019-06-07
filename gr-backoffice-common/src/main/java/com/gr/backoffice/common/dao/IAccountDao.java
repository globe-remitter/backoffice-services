package com.gr.backoffice.common.dao;

import com.gr.backoffice.common.entity.Account;

import java.util.List;

public interface IAccountDao {
    public Account save(Account account);
    public Account get(Integer id);
    public List<Account> getAllAccounts();
    public int update(Account account);
    public int delete(Integer id);
}
