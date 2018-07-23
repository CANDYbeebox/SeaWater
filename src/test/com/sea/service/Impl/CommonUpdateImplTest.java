package com.sea.service.Impl;

import com.sea.entity.RequestBodyEntity;
import com.sea.service.CommonUpdateFun;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/7/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class CommonUpdateImplTest {
    @Autowired
    CommonUpdateFun commonUpdateFun;

    @Test
    public void updateOneProperty() {
        RequestBodyEntity r = new RequestBodyEntity(3, "windone", "windturb1_40005", "4.12");
        commonUpdateFun.updateOneProperty(r);
    }

}