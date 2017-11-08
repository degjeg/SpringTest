package com.spring.test.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2017-11-08.
 */
@Configuration
@ComponentScan("com.spring.test.aop")
@EnableAspectJAutoProxy

public class SpringConfig {
}
