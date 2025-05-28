package com.example.Ch13_Ex1.rowMapper;

import com.example.Ch13_Ex1.models.AccountModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountMapper implements RowMapper<AccountModel> {
    @Override
    public AccountModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        AccountModel a = new AccountModel();
        a.setId(rs.getInt("id"));
        a.setName(rs.getString("name"));
        a.setAmount(rs.getBigDecimal("amount"));

        return a;
    }
}
