package com.sea.service.Impl;

import com.exception.NullException;
import com.exception.updateException;
import com.sea.dao.WindDao;
import com.sea.entity.WindElectricEntity;
import com.sea.entity.WindEletricTwoEntity;
import com.sea.service.Wind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by try on 2018/3/27.
 */
@Service
public class WindImpl implements Wind {
    @Autowired
    WindDao windDao;

    @Override
    @Transactional
    public void updateWindOne(WindElectricEntity windElectricEntity) throws RuntimeException{
        int updateAResult = windDao.updateWindOne(windElectricEntity);
        if (updateAResult <= 0) {
            throw new updateException("更新风机1数据失败");
        }
    }

    @Override
    public WindElectricEntity selectById(int id) throws RuntimeException{
        WindElectricEntity w = windDao.selectById(id);
        if (w == null) {
            throw new NullException("没有id为" + id + "的风机信息");
        }
        return w;
    }

    @Override
    public void updateWindTwo(WindEletricTwoEntity windEletricTwoEntity) throws RuntimeException{
        int updateResult = windDao.updateWindTwo(windEletricTwoEntity);
        if (updateResult <= 0) {
            throw new updateException("更新风机2数据失败");
        }
    }

    @Override
    public WindEletricTwoEntity selectWindTwoById(int id) {
        WindEletricTwoEntity w = windDao.selectWindTwoById(id);
        if (w == null) {
            throw new NullException("没有id为" + id + "的风机信息");
        }
        return w;
    }


}
