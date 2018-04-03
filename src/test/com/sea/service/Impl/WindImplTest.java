package com.sea.service.Impl;

import com.sea.entity.WindElectricEntity;
import com.sea.service.Wind;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/3/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class WindImplTest {
    @Autowired
    Wind wind;

    @Test
    public void updateWindOne() throws Exception {
    }

    @Test
    public void selectById() throws RuntimeException {
        try {
            WindElectricEntity w = wind.selectById(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}