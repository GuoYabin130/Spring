package com.baizhi.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection implements FactoryBean<Connection> {
    private String driver;
    private String url;
    private String username;
    private String password;


    @Override
    public Connection getObject() throws Exception {
        //加载驱动
        Class.forName(driver);
        //获得连接
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
