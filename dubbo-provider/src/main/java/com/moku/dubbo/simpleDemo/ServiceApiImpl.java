package com.moku.dubbo.simpleDemo;

import com.moku.dubbo.simpleDemo.api.ServiceApi;

public class ServiceApiImpl implements ServiceApi {
    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }
}
