package com.spring.test.autowire.configbyanotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * DI表示注入
 * Created by Administrator on 2017-11-08.
 */
@Configuration
@ComponentScan("com.spring.test.autowire")
public class DiConfig {
}
