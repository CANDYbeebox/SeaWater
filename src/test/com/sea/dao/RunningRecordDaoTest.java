package com.sea.dao;

import com.JUnit4Class;
import com.sea.entity.RunningRecordEntity;
import org.apache.tools.ant.types.resources.FileResourceIterator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/4/20.
 */
@RunWith(JUnit4Class.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class RunningRecordDaoTest {
    @Autowired
    RunningRecordDao rDao;

    @Test
    public void selectByTime() throws Exception {
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());
//        Timestamp time = new Timestamp(date.getTime());
//        System.out.println(time);
//        System.out.println(rDao.selectByTime(new Timestamp(1514822400000L)));
        List list = rDao.selectByTime(new Timestamp(1514822300000L), new Timestamp(1514908800000L), "runningrecordyancheng");
        System.out.println("asdsd");
//        System.out.println(rDao.selectByTime(1));1514908800
//        Timestamp time = new Timestamp(1200000000000);
    }

    @Test
    public void insert() throws Exception {
        for (int i = 200; i < 203; i++) {
            RunningRecordEntity r = new RunningRecordEntity(i, new Timestamp(1514822310000L + 60 * i * 1000L), String.valueOf(i),
                    String.valueOf(i), String.valueOf(i), String.valueOf(i), String.valueOf(i), String.valueOf(i), String.valueOf(i));

            rDao.insertRunningRecordPerMinute(r, "runningrecordyancheng");
        }
    }
}