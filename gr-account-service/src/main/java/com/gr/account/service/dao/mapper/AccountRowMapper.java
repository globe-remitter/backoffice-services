package com.gr.account.service.dao.mapper;

import com.gr.backoffice.common.entity.DummyAccount;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<DummyAccount> {

    private static final String ID = "ID";
    private static final String ACCOUNT_NAME = "ACCOUNT_NAME";
    @Override
    public DummyAccount mapRow(ResultSet resultSet, int i) throws SQLException {
        DummyAccount dummyAccount = new DummyAccount();
        dummyAccount.setId(resultSet.getInt(ID));
        dummyAccount.setAccountName(resultSet.getString(ACCOUNT_NAME));
        return dummyAccount;
    }
}
