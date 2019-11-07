package com.baizhi.service;

import com.baizhi.dao.UserDAO;

public class ServiceImpl implements Service {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
        //我的你的同时
        //我第二次提交了哦 小郭
    }

    @Override
    public void regise() {
        //哈哈
        //哈哈哈哈哈啊哈哈哈
        //哈哈
        userDAO.save();
    }
}
