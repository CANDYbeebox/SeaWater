package com.sea.dao;

import com.sea.entity.RequestBodyEntity;

/**
 * Created by try on 2018/7/22.
 */
public interface CommonUpdateDao {

//    int updateOneProperty(@Param("id") int id, @Param("table") String table, @Param("key") String key, @Param("value") String value);
    int updateOneProperty(RequestBodyEntity requestBodyEntity);

}
