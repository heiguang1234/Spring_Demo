package com.cl.bean;

public class Orders {
    private String oname;

    public Orders() {
        System.out.println("步骤一，调用初始化方法创建实例");
    }

    public void setOname(String oname) {
        System.out.println("步骤二，调用属性值赋值");
        this.oname = oname;
    }

    public void initMethod(){
        System.out.println("步骤三，调用初始化方法");
    }
    public void destoryMethod(){
        System.out.println("步骤五，调用销毁方法");
    }
}
