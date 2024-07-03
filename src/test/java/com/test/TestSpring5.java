package com.test;

import com.cl.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class TestSpring5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user);


    }
}
