package com.springboot.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.springboot.aop.service.*.*(..))")
    public void beforeGetMessage(JoinPoint joinPoint) {
        System.out.println("hi aspect");
        System.out.println(joinPoint.getArgs()[0]);
    }

    public void afterGetMessage() {

    }
}
