package tech.dongfei.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.dongfei.spring.autowire.Emp;
import tech.dongfei.spring.bean.Order;
import tech.dongfei.spring.collectiontype.Course;

public class CollectionTest04 {

    public ApplicationContext getApplicationContextFactory() {
        return new ClassPathXmlApplicationContext("applicationContext04.xml");
    }

    /**
     * 测试自动装配
     */
    @Test
    public void test01() {
        ApplicationContext context = getApplicationContextFactory();
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

}
