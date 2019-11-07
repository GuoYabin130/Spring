package com.baizhi.test;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.Order;
import com.baizhi.entity.User;
import com.baizhi.factorybean.MyConnection;
import com.baizhi.service.Service;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TestFactory {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAOImpl = (UserDAO) ac.getBean("UserDAOImpl");
        userDAOImpl.save();
    }

    @Test
    public void Test3() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) ac.getBean("UserDAO");
        userDAO.save();
    }

    @Test
    public void Test4() throws Exception {
        //通过反射创建类对象
        Class<?> aClass = Class.forName("com.baizhi.entity.User");
        User user = (User) aClass.newInstance();
        System.out.println(user);
        User user2 = (User) aClass.newInstance();
        System.out.println(user2);
        //类的对象地址相同
    }

    @Test
    public void Test5() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) ac.getBean("Service");
        service.regise();
    }

    @Test
    public void Test6() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Order order = (Order) ac.getBean("order");
        System.out.println(order);
    }

    @Test
    public void Test7() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connection = (Connection) ac.getBean("connection");
        System.out.println(connection);
        Connection connection1 = (Connection) ac.getBean("connection");
        System.out.println(connection1);

        MyConnection myConnection = (MyConnection) ac.getBean("&connection");
        System.out.println(myConnection);

    }

    @Test
    public void Test8() throws Exception {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ac.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
        ac.close();
    }

}
