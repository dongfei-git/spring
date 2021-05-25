package tech.dongfei.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tech.dongfei.spring.dao.UserDao;

import javax.annotation.Resource;

//@Service(value = "userService")
@Service
public class UserService {

    @Value(value = "user01")
    private String name;

//    @Autowired
//    @Qualifier(value = "userDaoImpl")
//    private UserDao userDao;

    @Resource
    private UserDao userDao;

    public void add() {
        System.out.println("user service add...");
        userDao.update();
        System.out.println(name);
    }
}
