package com.sea.service;

import com.sea.entity.BatteryPack;

/**
 * Created by try on 2018/4/1.
 */
public interface BatteryPackFun {

    void updateBatteryPack(BatteryPack b);

    BatteryPack selectBatteryPackById(int id);
}
