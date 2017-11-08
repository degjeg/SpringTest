package com.spring.test.autowire.configbyjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017-11-08.
 */
@Configuration
public class JavaConfig {

    /**
     * 注意
     * 1.使用Bean注解表示一个bean
     * 2.方法名就是bean名
     * 3.FunctionService没有添加任何@Service @Component之类的注解
     * @return
     */
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UserFunctionService useFunctionService() {
        return new UserFunctionService(functionService());
    }
}
