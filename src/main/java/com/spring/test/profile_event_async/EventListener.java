package com.spring.test.profile_event_async;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-11-08.
 */
@Component
public class EventListener implements ApplicationListener<DemoEvent>{
    @Override
    public void onApplicationEvent(DemoEvent event) {
        System.out.println("recv:"+event);
    }
}
