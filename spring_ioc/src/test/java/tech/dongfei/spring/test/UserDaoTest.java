package tech.dongfei.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.dongfei.spring.bean.Book;
import tech.dongfei.spring.bean.Emp;
import tech.dongfei.spring.bean.Order;
import tech.dongfei.spring.dao.UserDao;
import tech.dongfei.spring.service.UserService;

public class UserDaoTest {
    public ApplicationContext getApplicationContextFactory() {
        return new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.save();
    }

    @Test
    public void test02() {
        ApplicationContext context = getApplicationContextFactory();
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void test03() {
        ApplicationContext context = getApplicationContextFactory();
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void test04() {
        ApplicationContext context = getApplicationContextFactory();
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test05() {
        ApplicationContext context = getApplicationContextFactory();
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

}
