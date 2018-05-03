package com.sea.service.Impl;

import com.sea.dao.RunningRecordDao;
import com.sea.service.RunningRecordFun;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/5/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class RunningRecordImplTest {
    @Autowired
    RunningRecordFun rFun;

    @Test
    public void name() throws Exception {
        List r = rFun.selectRecord(new Timestamp(1514822300000L - 1L), new Timestamp(1514822300000L + 1L), "runningrecordyancheng");
        System.out.println("dssds");
    }
}