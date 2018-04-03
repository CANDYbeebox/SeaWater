package com.sea.service;

import com.sea.entity.EnergyStorageConverter;

/**
 * Created by try on 2018/3/31.
 */
public interface EnergyStorage {

    void updateEnergyStorage(EnergyStorageConverter energyStorageConverter);

    EnergyStorageConverter selectEnergyStorageById(int id);
}
