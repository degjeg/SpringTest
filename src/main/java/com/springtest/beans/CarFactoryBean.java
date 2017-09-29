package com.springtest.beans;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Administrator on 2017/9/29.
 */
public class CarFactoryBean implements FactoryBean<Car> {
    String name;

    public CarFactoryBean() {
    }

    public CarFactoryBean(String name) {
        this.name = name;
    }

    public Car getObject() throws Exception {
        return new Car(name);
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
