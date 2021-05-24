package tech.dongfei.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.dongfei.spring.collectiontype.Book;
import tech.dongfei.spring.collectiontype.Student;

public class CollectionTest02 {

    public ApplicationContext getApplicationContextFactory() {
        return new ClassPathXmlApplicationContext("applicationContext02.xml");
    }

    @Test
    public void test01() {
        ApplicationContext context = getApplicationContextFactory();
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void test02() {
        ApplicationContext context = getApplicationContextFactory();
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }

}
