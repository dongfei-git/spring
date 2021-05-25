package tech.dongfei.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 */
@Component
@Aspect
@Order(2)
public class UserProxy {
    // 相同切入点抽取
    @Pointcut(value = "execution(* tech.dongfei.spring.aop.User.add(..))")
    public void pointDemo() {

    }

    // 前置通知
    @Before("pointDemo()")
    public void before() {
        System.out.println("before...");
    }

    // 最后置通知
    @AfterReturning("pointDemo()")
    public void afterReturning() {
        System.out.println("AfterReturning...");
    }

    // 异常通知
    @AfterThrowing("pointDemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

    // 环绕通知
    @Around("pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前...");
        proceedingJoinPoint.proceed(); // 执行被增强的方法
        System.out.println("环绕之后...");
    }

    // 最终通知
    @After("pointDemo()")
    public void after() {
        System.out.println("after...");
    }

}
