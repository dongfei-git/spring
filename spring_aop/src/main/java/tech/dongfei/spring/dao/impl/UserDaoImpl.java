package tech.dongfei.spring.dao.impl;

import tech.dongfei.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public int add(int a, int b) {
        return a+b;
    }

    public String update(String id) {
        return id;
    }
}
