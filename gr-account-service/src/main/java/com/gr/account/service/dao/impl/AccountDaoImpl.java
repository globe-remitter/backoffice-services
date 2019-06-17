package com.gr.account.service.dao.impl;

import com.gr.account.service.dao.mapper.AccountRowMapper;
import com.gr.backoffice.common.dao.IAccountDao;
import com.gr.backoffice.common.entity.DummyAccount;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class AccountDaoImpl extends AbstractDaoImpl implements IAccountDao {

    private static final String TBL_NAME = "TBL_ACCOUNT_SERVICE";
    private static final String INSERT = "INSERT INTO " + TBL_NAME + "(ACCOUNT_NAME) VALUES(?)";
    private static final String SELECT_BY_ID = "SELECT * FROM " + TBL_NAME + " WHERE ID = ?";
    private static final String SELECT_ALL = "SELECT * FROM " + TBL_NAME;
    private static final String UPDATE_ACCOUNT_NAME = "UPDATE " + TBL_NAME + " SET ACCOUNT_NAME = ? WHERE ID = ?";

    @Override
    public DummyAccount save(DummyAccount dummyAccount) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection
                    .prepareStatement(INSERT, new String[]{"ID"});
            ps.setString(1, dummyAccount.getAccountName());
            return ps;
        }, keyHolder);

     /*   jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[] { "employee_id" });
                ps.setString(1, "John");
                ps.setString(2, "Doe");
                return ps;
            }
        }, keyHolder);
        */

        int id = keyHolder.getKey().intValue();
        dummyAccount.setId(id);
        return dummyAccount;
    }

    @Override
    public DummyAccount get(Integer id) {
        try {
            return jdbcTemplate.queryForObject(SELECT_BY_ID, new Object[]{id}, new AccountRowMapper());
        }
        catch (EmptyResultDataAccessException e)
        {
            return null;
        }
    }

    @Override
    public List<DummyAccount> getAllAccounts() {
        try {
            return jdbcTemplate.query(SELECT_ALL, new AccountRowMapper());
        }
        catch (EmptyResultDataAccessException e)
        {
            return null;
        }
    }

    @Override
    public int update(DummyAccount dummyAccount) {
        return jdbcTemplate.update(UPDATE_ACCOUNT_NAME, new Object[]{dummyAccount.getAccountName(), dummyAccount.getId()});
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }
}
