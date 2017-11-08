package com.springtest;

import com.springtest.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * Hello world!
 */
public class SpringScopRelationTest {
    public static void main(String[] args) {
        System.out.println(new File("nnn").getAbsolutePath());
        ApplicationContext app = new ClassPathXmlApplicationContext("beans-scope.xml");

        Car bmw11 = (Car) app.getBean("bmw1"); // 通过 MySprintCfg.xml定义的id获得对象
        Car bmw12 = (Car) app.getBean("bmw1"); // 通过 MySprintCfg.xml定义的id获得对象
        Car bmw21 = (Car) app.getBean("car2"); // 通过 MySprintCfg.xml定义的id获得对象
        Car bmw22 = (Car) app.getBean("car2"); // 通过 MySprintCfg.xml定义的id获得对象
        System.out.println("bmw1 " + (bmw11==bmw12));
        System.out.println("bmw2 " + (bmw21==bmw22));




    }
}
