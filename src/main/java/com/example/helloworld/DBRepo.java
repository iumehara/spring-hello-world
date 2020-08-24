package com.example.helloworld;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DBRepo implements Repo {
    private final JdbcTemplate jdbcTemplate;

    public DBRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<String> getAll() {
        return jdbcTemplate.query(
                "select * from greetings",
                (rs, r) -> rs.getString("sentence")
        );
    }
}
