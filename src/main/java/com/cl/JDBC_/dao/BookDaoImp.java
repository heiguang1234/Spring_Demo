package com.cl.JDBC_.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImp {
    @Autowired
    private JdbcTemplate jdbcTemplate;
}
