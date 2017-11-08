package com.springtest.beans;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/29.
 */
@Component
public class AutoScanTest1 {
    String n = "n 有默认值";

    @Override
    public String toString() {
        return "AutoScanTest1{" +
                "n='" + n + '\'' +
                '}';
    }
}
