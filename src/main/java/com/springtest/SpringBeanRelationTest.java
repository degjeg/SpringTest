package com.springtest;

import com.springtest.beans.Car;
import com.springtest.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * Hello world!
 */
public class SpringBeanRelationTest {
    public static void main(String[] args) {
        System.out.println(new File("nnn").getAbsolutePath());
        ApplicationContext app = new ClassPathXmlApplicationContext("beans-relation.xml");

        Car bmw1 = (Car) app.getBean("bmw1"); // 通过 MySprintCfg.xml定义的id获得对象
        Car bmw2 = (Car) app.getBean("car2"); // 通过 MySprintCfg.xml定义的id获得对象
        System.out.println("bmw1 " + bmw1);
        System.out.println("bmw2 " + bmw2);

        Person person1 = (Person) app.getBean("person1");
        System.out.println("person1 " + person1);


    }
}
