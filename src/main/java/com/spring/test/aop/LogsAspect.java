package com.spring.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-11-08.
 */
@Aspect // 1.声明一个切面
@Component
public class LogsAspect {


    @Pointcut("@annotation(com.spring.test.aop.Action)")
    public void annotationPointCut() {
        System.out.println("annotationPointCut");
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        if ("regSuperUser".equals(methodName)) {
            System.out.println("检查是否满足超级会员条件:");
            for (int i = 0; i < joinPoint.getArgs().length; i++) {
                System.out.println(joinPoint.getArgs()[i]);
            }
        }
    }

    /**
     * http://blog.csdn.net/is_zhoufeng/article/details/7821396
     * 拦截DemoMethodService类的所有方法调用
     * @param joinPoint
     */
    @Before("execution(* com.spring.test.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        if ("deleteUser".equals(methodName)) {
            long uid = (long)joinPoint.getArgs()[0];

            if (uid < 10) {
                System.out.println("超级会员,无法删除");
                // joinPoint.
            } else {

            }
        }
    }
}


