package com.test;

import com.cl.Autowire.Emp;
import com.cl.bean.Orders;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean01 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("步骤四：获取到对象");
//      关闭容器，之后调用销毁方法
        context.close();

    }
    @Test
    public void Test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
