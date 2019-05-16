package com.ll.demo.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProxyService {
    @Before("execution(* com.ll.demo.service.*ServiceImp.*(..))")
    public void before(){
        System.out.println("方法前！");
    }
    @After("execution(* com.ll.demo.service.*ServiceImp.*(..))")
    public void after(){
        System.out.println("方法后！");
    }
}
