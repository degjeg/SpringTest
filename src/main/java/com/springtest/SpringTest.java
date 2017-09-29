package com.springtest;

import com.springtest.beans.AutoScanTest1;
import com.springtest.beans.Car;
import com.springtest.beans.Person;
import com.springtest.beans.ServerConfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * Hello world!
 */
public class SpringTest {
    public static void main(String[] args) {
        System.out.println(new File("nnn").getAbsolutePath());
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("MySprintCfg.xml");

        Car bmw1 = (Car) app.getBean("bmw1"); // 通过 MySprintCfg.xml定义的id获得对象
        Car bmw2 = (Car) app.getBean("bmw2"); // 通过 MySprintCfg.xml定义的id获得对象
        Car carByFactory = (Car) app.getBean("car3"); // 通过 MySprintCfg.xml定义的id获得对象
        Car carByFactory1 = (Car) app.getBean("car4"); // 通过 MySprintCfg.xml定义的id获得对象
        Car carByFactoryBeen = (Car) app.getBean("car5"); // 通过 MySprintCfg.xml定义的id获得对象
        System.out.println("bmw1 " + bmw1);
        System.out.println("bmw2 " + bmw2);
        System.out.println("carByFactory " + carByFactory);
        System.out.println("carByFactory1 " + carByFactory1);
        System.out.println("carByFactoryBeen " + carByFactoryBeen);

        Person person1 = (Person) app.getBean("person1");
        System.out.println("person1 " + person1);

        Person person2 = (Person) app.getBean("person2");
        System.out.println("person2 " + person2);

        ServerConfig serverConfig = (ServerConfig) app.getBean("serverConfig");
        System.out.println("serverConfig " + serverConfig);


        AutoScanTest1 test1 = (AutoScanTest1) app.getBean("autoScanTest1");
        System.out.println("test1111111111111 " + test1);

        app.close();
    }
}
