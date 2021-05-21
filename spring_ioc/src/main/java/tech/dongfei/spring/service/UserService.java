package tech.dongfei.spring.service;

import tech.dongfei.spring.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void add() {
        System.out.println("service add");
        userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
