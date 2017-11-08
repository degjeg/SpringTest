package com.spring.test.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-11-08.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService { // 默认为singleton
}
