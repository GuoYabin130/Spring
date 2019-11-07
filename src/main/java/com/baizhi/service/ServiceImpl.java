package com.baizhi.service;

import com.baizhi.dao.UserDAO;

public class ServiceImpl implements Service {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void regise() {
        userDAO.save();
    }
}
