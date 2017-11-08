package com.spring.test.profile_event_async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017-11-08.
 */
@Component
public class Publisher {

    @Autowired
    ApplicationContext context;

    final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss ");

    public void publish(String event) {
        context.publishEvent(new DemoEvent(this, event));
        System.out.println(format.format(new Date()) + "publish");
    }

    @Scheduled(fixedRate = 3000)
    public void publishEverySecond() {
        // context.publishEvent(new DemoEvent(this, event));
        System.out.println(format.format(new Date()) + "publish");
    }

    @Scheduled(cron = "0 21 16 * * *")
    public void publishEveryDay() {
        System.out.println(format.format(new Date()) + "publishEveryDay");
    }

    @Async
    public void asyncTask() {
        System.out.println("start" + this);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end" + this);

    }


//    public void reportCurrentTime() {
//
//    }
}
