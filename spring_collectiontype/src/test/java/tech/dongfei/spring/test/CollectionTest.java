package tech.dongfei.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.dongfei.spring.collectiontype.Student;

public class CollectionTest {

    public ApplicationContext getApplicationContextFactory() {
        return new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test01() {
        ApplicationContext context = getApplicationContextFactory();
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
    }

}
