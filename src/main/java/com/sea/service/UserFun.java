package com.sea.service;

import com.sea.entity.UserEntity;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by try on 2017/9/15.
 */
public interface UserFun {

    void updateName(UserEntity userEntity);


//    UserEntity login(String account,String password);

    UserEntity getByUsername(String username);

    Set<String> getRoles(String username);

}
