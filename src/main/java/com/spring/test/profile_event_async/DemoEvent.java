package com.spring.test.profile_event_async;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2017-11-08.
 */
public class DemoEvent extends ApplicationEvent {
    private String eventName;

    public DemoEvent(Object source) {
        super(source);
    }

    public DemoEvent(Object source, String eventName) {
        super(source);
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "eventName=" + eventName;
    }
}
