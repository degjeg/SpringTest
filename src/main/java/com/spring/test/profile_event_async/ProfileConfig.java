package com.spring.test.profile_event_async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by Administrator on 2017-11-08.
 */
@Configuration
@ComponentScan("com.spring.test.profile_event_async")
@EnableAsync
@EnableScheduling
public class ProfileConfig implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(200);
        executor.setQueueCapacity(20000);
        executor.initialize();
        return executor;
    }

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("开发测试bean");
    }


    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("生产环境bean");
    }
}
