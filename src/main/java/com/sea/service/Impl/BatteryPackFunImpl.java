package com.sea.service.Impl;

import com.exception.updateException;
import com.sea.dao.BatteryPackDao;
import com.sea.entity.BatteryPack;
import com.sea.service.BatteryPackFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by try on 2018/4/1.
 */
@Service
public class BatteryPackFunImpl implements BatteryPackFun{
    @Autowired
    BatteryPackDao bDao;

    @Override
    public void updateBatteryPack(BatteryPack b) throws RuntimeException{
        int updateResult = bDao.updateBatteryPack(b);
        if (updateResult <= 0) {
            throw new updateException("更新电池组数据失败");
        }
    }

    @Override
    public BatteryPack selectBatteryPackById(int id) {
        return null;
    }
}
