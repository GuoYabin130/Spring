package com.baizhi.service;

import com.baizhi.dao.UserDAO;

public class ServiceImpl implements Service {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
        //我的你的同时
    }

    @Override
    public void regise() {
        //哈哈
        userDAO.save();
    }
}