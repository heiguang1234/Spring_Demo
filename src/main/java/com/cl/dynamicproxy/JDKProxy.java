package com.cl.dynamicproxy;

import com.sun.deploy.net.proxy.ProxyHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] Inter={UserDao.class};
        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),Inter,new UserDaoProxy());
    }
}




class UserDaoProxy implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}