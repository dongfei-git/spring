package tech.dongfei.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.dongfei.spring.aop.User;
import tech.dongfei.spring.config.SpringConfig;

public class AopTest {

    @Test
    public void test01() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

}
