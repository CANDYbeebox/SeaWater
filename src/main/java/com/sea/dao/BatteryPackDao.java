package com.sea.dao;

import com.sea.entity.BatteryPack;

/**
 * Created by try on 2018/4/1.
 */
public interface BatteryPackDao {

    int updateBatteryPack(BatteryPack b);

    BatteryPack selectBatteryPackById(int id);
}
