package com.moku.dubbo.simpleDemo.consumer;

import com.moku.dubbo.simpleDemo.api.ServiceApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class consumer {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/consumerConfig.xml");
        context.start();
        System.out.println("consumer connect");
        ServiceApi serviceApi = (ServiceApi) context.getBean("serviceApi");
        Integer num1 = 1,num2 = 3;
        System.out.println(num1 + " + " + num2 + " = ?");
        System.out.println("答案： "+serviceApi.sum(1,2));
    }

}
