package com.sea.dao;

import com.sea.entity.EnergyStorageConverter;

/**
 * Created by try on 2018/3/31.
 */
public interface EnergyStorageDao {

    int updateEnergyStorage(EnergyStorageConverter e);

    EnergyStorageConverter selectEnergyStorageById(int id);
}
