package com.spring.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017-11-08.
 */
public class Main {

    public static void main(String[]args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        DemoAnnotationService demoAnnotationService  = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService  = context.getBean(DemoMethodService.class);
        demoAnnotationService.regSuperUser("333");
        demoMethodService.deleteUser(1);
        demoMethodService.deleteUser(444);

    }
}
