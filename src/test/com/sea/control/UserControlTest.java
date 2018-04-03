package com.sea.control;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.util.ThreadContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/3/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-context.xml"})
//@ContextConfiguration(locations = {"classpath:spring*.xml"})
public class UserControlTest {

    @Autowired
    UserControl userControl;

    @Resource
    org.apache.shiro.mgt.DefaultSecurityManager securityManager;
//    org.apache.shiro.web.mgt.DefaultWebSecurityManager securityManager;


}