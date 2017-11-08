package com.spring.test.autowire.configbyanotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-11-08.
 */
@Service
public class UserFunctionService {
    @Autowired
    private FunctionService service;

    public String sayHello(String name) {
        return service.sayHello() + ":" + name;
    }
}
