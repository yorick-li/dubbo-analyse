package com.dubbo.demo.service.impl;

import com.dubbo.demo.service.IDemoService;

public class DemoServiceImpl implements IDemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
