package com.spring.test.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-11-08.
 */
@Service
public class DemoMethodService {

    public void deleteUser(long uid) {
        System.out.println("删除用户:" + uid);
    }
}
