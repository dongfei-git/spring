package tech.dongfei.spring.dao.impl;

import org.springframework.stereotype.Repository;
import tech.dongfei.spring.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

    public void update() {
        System.out.println("update...");
    }
}
