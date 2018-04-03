package com.sea.dao;

import com.sea.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/3/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void updateUser() throws Exception {
//        UserEntity u = new UserEntity();
//        u.setUsername("kaka");
//        userDao.updateUser(u);
    }

    @Test
    public void getrole() throws Exception {
        System.out.println(userDao.getRoles("kaka"));
    }
}