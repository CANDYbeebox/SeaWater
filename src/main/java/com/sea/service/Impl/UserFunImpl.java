package com.sea.service.Impl;

import com.sea.dao.UserDao;
import com.sea.entity.UserEntity;
import com.sea.service.UserFun;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by try on 2017/9/15.
 */
@Service
public class UserFunImpl implements UserFun {

    @Autowired
    private UserDao udao;


    @Override
    public void updateName(UserEntity userEntity) {
        udao.updateUser(userEntity);

    }

    @Override
    public UserEntity getByUsername(String username) {
        return udao.getByUsername(username);
    }

    @Override
    public Set<String> getRoles(String username) {
        return udao.getRoles(username);
    }
}
