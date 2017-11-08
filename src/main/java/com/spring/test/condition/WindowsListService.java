package com.spring.test.condition;

/**
 * Created by Administrator on 2017-11-08.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCommand() {
        return "dir";
    }
}
