package com.spring.test.autowire.configbyjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017-11-08.
 */
public class Main {

    public static void main(String[]args) {
        ApplicationContext context =new  AnnotationConfigApplicationContext(JavaConfig.class);

        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.sayHello("danger"));
        // context.
    }
}
