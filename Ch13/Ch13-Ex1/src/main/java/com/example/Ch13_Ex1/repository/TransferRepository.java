package com.example.Ch13_Ex1.repository;

import com.example.Ch13_Ex1.models.AccountModel;
import com.example.Ch13_Ex1.rowMapper.AccountMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class TransferRepository {
    private final JdbcTemplate jdbcTemplate;

    public TransferRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void changeAmount(BigDecimal amount, int id){
        String sql = "update Account set amount = ? where id = ?";
        jdbcTemplate.update(sql,amount,id);
    }


    public AccountModel findAccById(int id){
        String sql = "select * from Account where id = ?";

        return jdbcTemplate.queryForObject(sql,new AccountMapper(),id);

    }


    public List<AccountModel> findAll(){
        String sql = "select * from Account";

        return jdbcTemplate.query(sql,new AccountMapper());
    }



}
