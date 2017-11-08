package com.spring.test.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017-11-08.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
    }
}
