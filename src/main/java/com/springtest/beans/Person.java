package com.springtest.beans;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/29.
 */
public class Person {

    String name;
    int age;
    String addr;

    Car mainCar;
    List<Car> cars;
    Map<String, Person> contacts;

    public Person() {
    }

    public Person(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Map<String, Person> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, Person> contacts) {
        this.contacts = contacts;
    }

    public Car getMainCar() {
        return mainCar;
    }

    public void setMainCar(Car mainCar) {
        this.mainCar = mainCar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", \nmainCar=" + mainCar +
                ", \ncars=" + cars +
                ", \ncontacts=" + contacts +
                "}\n";
    }
}
