package com.sea.dao;

import com.sea.entity.WindElectricEntity;
import com.sea.entity.WindEletricTwoEntity;

/**
 * Created by try on 2018/3/27.
 */
public interface WindDao {

    /**
     * 风机1
     * @param w
     * @return
     */
    int updateWindOne(WindElectricEntity w);

    /**
     *
     * 风机1
     * @param id
     * @return
     */
    WindElectricEntity selectById(int id);

    /**
     * 风机2
     * @param w
     * @return
     */
    int updateWindTwo(WindEletricTwoEntity w);

    /**
     * 风机2
     * @param id
     * @return
     */
    WindEletricTwoEntity selectWindTwoById(int id);


}
