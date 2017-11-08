package com.spring.test.autowire.configbyanotation;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-11-08.
 */
@Service
public class FunctionService {

    public String sayHello() {
        return "Hello";
    }
}
