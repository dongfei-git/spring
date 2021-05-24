package tech.dongfei.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;
import tech.dongfei.spring.collectiontype.Course;

public class MyBean implements FactoryBean<Course> {

    // 定义返回的bean对象
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("java");
        return course;
    }

    public Class<?> getObjectType() {
        return null;
    }

    public boolean isSingleton() {
        return false;
    }
}
