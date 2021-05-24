package tech.dongfei.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.dongfei.spring.bean.Order;
import tech.dongfei.spring.collectiontype.Book;
import tech.dongfei.spring.collectiontype.Course;
import tech.dongfei.spring.factorybean.MyBean;

public class CollectionTest03 {

    public ApplicationContext getApplicationContextFactory() {
        return new ClassPathXmlApplicationContext("applicationContext03.xml");
    }

    @Test
    public void test01() {
        ApplicationContext context = getApplicationContextFactory();
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }

    /**
     * 测试bean的声明周期
     */
    @Test
    public void test02() {
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) getApplicationContextFactory();
        Order order = context.getBean("order", Order.class);
        System.out.println("第四步 拿到对象");
        System.out.println(order);
        context.close();
    }

}
