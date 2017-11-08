package com.spring.test.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2017-11-08.
 */
@Service
public class DemoService {

    @Value("其它类的属性")
    String another;

    @PostConstruct
    public void init() {

    }

    @PreDestroy
    public void destroy() {

    }
    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
