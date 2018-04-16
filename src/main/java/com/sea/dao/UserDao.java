package com.sea.dao;

import com.sea.entity.CompanyEntity;
import com.sea.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by try on 2018/3/23.
 */
public interface UserDao {

    void updateUser(UserEntity u);

    UserEntity getByUsername(String username);

    Set<String> getRoles(String username);

    //得到公司数据
    List<CompanyEntity> getCompany();

}
