package com.gr.account.service.dao.mapper;

import com.gr.backoffice.common.entity.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {

    private static final String ID = "ID";
    private static final String ACCOUNT_NAME = "ACCOUNT_NAME";
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt(ID));
        account.setAccountName(resultSet.getString(ACCOUNT_NAME));
        return account;
    }
}
