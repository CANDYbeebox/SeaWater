package com.sea.dao;

import com.JUnit4Class;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/4/10.
 */
@RunWith(JUnit4Class.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class DesalinplantDaoTest {
    @Autowired
    DesalinplantDao ddao;

    @Test
    public void updateDesalinplant() throws Exception {
    }

    @Test
    public void selectDesalinplantById() throws Exception {
        assertEquals(null, ddao.selectDesalinplantById(11));

    }

}