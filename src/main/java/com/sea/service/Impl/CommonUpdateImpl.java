package com.sea.service.Impl;

import com.exception.updateException;
import com.sea.dao.CommonUpdateDao;
import com.sea.entity.RequestBodyEntity;
import com.sea.service.CommonUpdateFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by try on 2018/7/23.
 */
@Service
public class CommonUpdateImpl implements CommonUpdateFun {
    @Autowired
    CommonUpdateDao commonUpdateDao;

    @Override
    public void updateOneProperty(RequestBodyEntity r) throws updateException {
        int updateResult = commonUpdateDao.updateOneProperty(r);
        if (updateResult <= 0) {
            throw new updateException("更新异常");
        }
    }
}
