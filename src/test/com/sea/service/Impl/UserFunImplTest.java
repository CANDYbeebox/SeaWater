package com.sea.service.Impl;

import com.sea.entity.UserEntity;
import com.sea.service.UserFun;
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
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class UserFunImplTest {


    @Autowired
    UserFun userFun;

    @Test
    public void updateName() throws Exception {
//        UserEntity u = new UserEntity();
//        u.setUsername("kaka");
//        userFun.updateName(u);
    }

}