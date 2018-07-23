package com.sea.service;

import com.exception.updateException;
import com.sea.dao.CommonUpdateDao;
import com.sea.entity.RequestBodyEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by try on 2018/7/23.
 */
public interface CommonUpdateFun {

    void updateOneProperty(RequestBodyEntity r) throws updateException;

}
