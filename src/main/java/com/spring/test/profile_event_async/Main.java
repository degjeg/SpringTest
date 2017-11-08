package com.spring.test.profile_event_async;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Created by Administrator on 2017-11-08.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);

        context.getBean(Publisher.class).publish("有人来了");

        for (int i = 0; i < 2; i++) {
            context.getBean(Publisher.class).asyncTask();
        }
        //context.setActiveProfiles("dev", "test");
        System.out.println(Arrays.toString(context.getEnvironment().getDefaultProfiles()));
        System.out.println(context.getEnvironment().acceptsProfiles("dev"));
        System.out.println(context.getEnvironment().acceptsProfiles("prod"));

        context.getEnvironment().acceptsProfiles("dev");
        System.out.println("" + context.getBean(DemoBean.class).getContent());
//        System.out.println("" + context.getBean(DevDemoBean.class).getContent());
//        System.out.println("" + context.getBean(ProdDemoBean.class).getContent());

        context.getEnvironment().acceptsProfiles("prod");
        System.out.println("" + context.getBean(DemoBean.class).getContent());
//        System.out.println("" + context.getBean(ProdDemoBean.class).getContent());
    }
}
