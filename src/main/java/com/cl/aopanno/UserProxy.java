package com.cl.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {
    @Pointcut(value = "execution(* com.cl.aopanno.User.add(..))")
    public void PointCut(){

    }
//    前置通知 方法执行之前
    @Before(value = "PointCut()")
    public void before(){
        System.out.println("before");
    }
//    最终通知 有没有异常都执行
    @After(value = "execution(* com.cl.aopanno.User.add(..))")
    public void after(){
        System.out.println("after");
    }
//    环绕通知:方法执行前后
    @Around(value = "execution(* com.cl.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后");
    }
//    异常通知：异常之后
    @AfterThrowing(value = "execution(* com.cl.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("异常通知");
    }
//    后置通知 方法执行完执行
    @AfterReturning(value = "execution(* com.cl.aopanno.User.add(..))")
    public void afteReturning(){
        System.out.println("最终通知");
    }
}
