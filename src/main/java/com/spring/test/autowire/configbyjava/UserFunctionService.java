package com.spring.test.autowire.configbyjava;

/**
 * Created by Administrator on 2017-11-08.
 */
public class UserFunctionService {
    private FunctionService service;

    public UserFunctionService() {
    }

    public UserFunctionService(FunctionService service) {
        this.service = service;
    }

    public String sayHello(String name) {
        return service.sayHello() + ":" + name;
    }
}
