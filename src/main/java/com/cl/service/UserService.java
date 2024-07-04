package com.cl.service;

import org.springframework.stereotype.Component;

@Component//不适用value进行赋值 则默认的id是首字母小写
public class UserService {
    public void add(){
        System.out.println("service add...");
    }
}
