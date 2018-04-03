package com.sea.dao;

import com.JUnit4Class;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import javax.sound.midi.Soundbank;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/4/1.
 */
@RunWith(JUnit4Class.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class BatteryPackDaoTest {
    @Autowired
    BatteryPackDao bDao;

    @Test
    public void updateBatteryPack() throws Exception {
    }

    @Test
    public void selectBatteryPackById() throws Exception {
        System.out.println(bDao.selectBatteryPackById(1));
    }

}