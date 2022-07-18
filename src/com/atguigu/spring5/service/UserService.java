package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;

/**
 * @author zhangweichen
 * @create 2022-07-18 9:22
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {

        System.out.println("service add......");

        userDao.update();
    }
}
