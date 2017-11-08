package com.spring.test.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-11-08.
 */
@Service
public class DemoService2 {

    @Value("其它类的属性")
    String another;

    public void init() {

    }

    public void destroy() {

    }
    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
