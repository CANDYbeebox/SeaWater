package com.sea.service.Impl;

import com.exception.NullException;
import com.exception.updateException;
import com.sea.dao.EnergyStorageDao;
import com.sea.entity.EnergyStorageConverter;
import com.sea.entity.WindEletricTwoEntity;
import com.sea.service.EnergyStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by try on 2018/3/31.
 */
@Service
public class EnergyStorageImpl implements EnergyStorage {
    @Autowired
    EnergyStorageDao energyStorageDao;

    @Override
    public void updateEnergyStorage(EnergyStorageConverter energyStorageConverter) {
        int updateResult = energyStorageDao.updateEnergyStorage(energyStorageConverter);
        if (updateResult <= 0) {
            throw new updateException("更新储能器数据失败");
        }
    }

    @Override
    public EnergyStorageConverter selectEnergyStorageById(int id) {
        EnergyStorageConverter w = energyStorageDao.selectEnergyStorageById(id);
        if (w == null) {
            throw new NullException("没有id为" + id + "的储能器信息");
        }
        return w;
    }
}
