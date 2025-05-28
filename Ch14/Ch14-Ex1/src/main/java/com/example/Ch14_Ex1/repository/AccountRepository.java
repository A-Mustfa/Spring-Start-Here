package com.example.Ch14_Ex1.repository;

import com.example.Ch14_Ex1.repoModel.Account;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account,Long> {
    @Query("select * from Account where name = :name")
    List<Account> findAccountsByName(String name);


    @Modifying
    @Query("update Account set amount = :amount where id = :id")
    void changeAmount(BigDecimal amount, Long id);
}
