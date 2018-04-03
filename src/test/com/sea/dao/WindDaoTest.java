package com.sea.dao;

import com.JUnit4Class;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/3/28.
 */
@RunWith(JUnit4Class.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class WindDaoTest {
    @Autowired
    WindDao windDao;

    @Test
    public void updateWindOne() throws Exception {
    }

    @Test
    public void selectById() throws Exception {
        System.out.println(windDao.selectById(1));
    }

    @Test
    public void selectWindTwoById() throws Exception {
        System.out.println(windDao.selectWindTwoById(1));
    }

    @Test
    public void updateWindTwo() throws Exception {
    }
}