package com.spring.test.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-11-08.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注册超级会员")
    public void regSuperUser(String code) {
        System.out.println("已注册成为超级会员");
    }
}
