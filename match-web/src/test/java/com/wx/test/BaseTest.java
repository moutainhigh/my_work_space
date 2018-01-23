package com.wx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class BaseTest {
    
    protected static ApplicationContext ctx = null;
    
    {
        ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    }
}