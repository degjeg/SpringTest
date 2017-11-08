package com.spring.test.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017-11-08.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("singletonService1" + (singletonService1 == singletonService2 ? "==" : "!=") + "singletonService2");
        System.out.println("prototypeService1" + (prototypeService1 == prototypeService2 ? "==" : "!=") + "prototypeService2");
    }
}
