package tech.dongfei.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {
    // 前置通知
    @Before("execution(* tech.dongfei.spring.aop.User.add(..))")
    public void before() {
        System.out.println("person before...");
    }
}
