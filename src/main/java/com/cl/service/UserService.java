package com.cl.service;

import com.cl.dao.UserDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//不适用value进行赋值 则默认的id是首字母小写
public class UserService {
    @Autowired
    private UserDaoImp userDaoImp;
    public void add(){
        System.out.println("service add...");
        userDaoImp.add();
    }
}
