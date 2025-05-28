package com.example.Ch12_Ex1.repo;

import com.example.Ch12_Ex1.model.Purchase;
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

    public List<Purchase> findAll(){
        String sql = "select * from Purchase";

        RowMapper<Purchase> rowMapper = (rs, rowNum) -> {
            Purchase purchase = new Purchase();
            purchase.setId(rs.getInt("id"));
            purchase.setProduct(rs.getString("product"));
            purchase.setPrice(rs.getBigDecimal("price"));
            return purchase;
        };

        return jdbcTemplate.query(sql,rowMapper);
    }

    public void store(Purchase purchase){
        String sql = "insert into Purchase(product, price) values(?,?)";
        jdbcTemplate.update(sql,purchase.getProduct(),purchase.getPrice());
    }

}
