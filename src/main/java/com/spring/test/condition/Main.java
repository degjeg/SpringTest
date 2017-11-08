package com.spring.test.condition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017-11-08.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.printf(listService.showListCommand());
    }
}
