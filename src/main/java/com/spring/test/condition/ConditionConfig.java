package com.spring.test.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017-11-08.
 */
@Configuration
@ComponentScan("com.spring.test.condition")
public class ConditionConfig {


    @Bean
    @Conditional(WindowsCondition.class)
    ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    ListService linuxListService() {
        return new LinuxListService();
    }
}
