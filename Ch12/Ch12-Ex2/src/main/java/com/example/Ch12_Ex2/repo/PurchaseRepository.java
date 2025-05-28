package com.example.Ch12_Ex2.repo;

import com.example.Ch12_Ex2.model.Purchase;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PurchaseRepository {
    private final JdbcTemplate jdbcTemplate;

    public PurchaseRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void store(Purchase purchase){
        String sql = "insert into Purchase(name,price) values(?,?)";

        jdbcTemplate.update(sql,purchase.getName(),purchase.getPrice());

    }


    public List<Purchase> findAll(){
        String sql = "select * from Purchase";

        RowMapper<Purchase> rowMapper = (rs , rowCount) -> {
            Purchase purchase = new Purchase();
            purchase.setId(rs.getInt("id"));
            purchase.setName(rs.getString("name"));
            purchase.setPrice(rs.getBigDecimal("price"));
            return purchase;
        };

        return jdbcTemplate.query(sql,rowMapper);

    }


}
