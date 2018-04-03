package com.sea.dao;

import com.JUnit4Class;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/3/31.
 */
@RunWith(JUnit4Class.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class EnergyStorageDaoTest {
    @Autowired
    EnergyStorageDao energyStorageDao;


    @Test
    public void updateEnergyStorage() throws Exception {
    }

    @Test
    public void selectEnergyStorageById() throws Exception {
        assertEquals(null, energyStorageDao.selectEnergyStorageById(2));
    }

}