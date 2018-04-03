package com.sea.service;

import com.sea.entity.WindElectricEntity;
import com.sea.entity.WindEletricTwoEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by try on 2018/3/27.
 */
public interface Wind {

    /**
     * 风机1
     * @param windElectricEntity
     */
    void updateWindOne(WindElectricEntity windElectricEntity) throws RuntimeException;

    /**
     * 风机1
     * @param id
     * @return
     * @throws RuntimeException
     */
    WindElectricEntity selectById(int id) throws RuntimeException;

    /**
     * 风机2
     * @param windEletricTwoEntity
     */
    void updateWindTwo(WindEletricTwoEntity windEletricTwoEntity) throws RuntimeException;

    /**
     * 风机2
     * @param id
     * @return
     */
    WindEletricTwoEntity selectWindTwoById(int id) throws RuntimeException;


}
