package com.springtest.beans;

/**
 * Created by Administrator on 2017/9/29.
 */
public class CarFactory {

    public static Car makeCar(String name) {
        return new Car(name);
    }

    public Car makeNewCar(String name) {
        return new Car(name);
    }
}
