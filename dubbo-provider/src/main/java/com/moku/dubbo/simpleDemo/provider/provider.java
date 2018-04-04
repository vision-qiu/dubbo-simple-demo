package com.moku.dubbo.simpleDemo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/providerConfig.xml");
        context.start();
        System.out.println("provider start");
        System.in.read();
    }
}
