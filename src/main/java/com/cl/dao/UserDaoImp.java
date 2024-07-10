package com.cl.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {
    @Override
    public void add() {
        System.out.println("dao添加了");
    }
}
