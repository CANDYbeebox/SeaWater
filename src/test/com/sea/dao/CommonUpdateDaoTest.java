package com.sea.dao;

import com.JUnit4Class;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/7/22.
 */
@RunWith(JUnit4Class.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class CommonUpdateDaoTest {
    @Autowired
    CommonUpdateDao commonUpdateDao;

    @Test
    public void updateOneProperty() throws Exception {
//        commonUpdateDao.updateOneProperty(1, "windone", "windturb1_40007", "520");
    }

}