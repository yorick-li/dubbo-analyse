package com.dubbo.demo.service.impl.com.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderApplication {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(
                        new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }

}
