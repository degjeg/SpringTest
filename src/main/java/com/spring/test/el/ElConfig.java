package com.spring.test.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by Administrator on 2017-11-08.
 */
@Configuration
@ComponentScan("com.spring.test.el")
@PropertySource("classpath:test.properties")
public class ElConfig {

    @Value("I love you!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private String randomNumber;

    @Value("#{demoService.another}")
    private String fromOther;

    @Value("classpath:errorPage.html")
    private String errorPage1;

    @Value("classpath:errorPage.html")
    private Resource errorPage2;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;


    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    DemoService2 demoService2() {
        return new DemoService2();
    }

    public void outputResource() {
        try {
            System.out.println("normal:" + normal);
            System.out.println("osName:" + osName);
            System.out.println("randomNumber:" + randomNumber);
            System.out.println("fromOther:" + fromOther);
            System.out.println("errorPage1:" + errorPage1);
            System.out.println("errorPage2:" + IOUtils.toString(errorPage2.getInputStream()));
            System.out.println("testUrl:" + IOUtils.toString(testUrl.getInputStream()));
            System.out.println("bookName:" + bookName);
            System.out.println("book.author:" + environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
