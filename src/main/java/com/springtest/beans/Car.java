package com.springtest.beans;

/**
 * Created by Administrator on 2017/9/29.
 */
public class Car {
    String cop;
    String name;
    int speed;
    double price;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String cop, String name, int speed) {
        this.cop = cop;
        this.name = name;
        this.speed = speed;
    }

    public Car(String cop, String name, double price) {
        this.cop = cop;
        this.name = name;
        this.price = price;
    }

    public String getCop() {
        return cop;
    }

    public void setCop(String cop) {
        this.cop = cop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void init() {
        System.out.println("开车init");
    }

    public void destroy() {
        System.out.println("停车车init");
    }
    @Override
    public String toString() {
        return "Car{" +
                "cop='" + cop + '\'' +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
