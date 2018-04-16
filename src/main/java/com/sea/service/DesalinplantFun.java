package com.sea.service;

import com.sea.entity.Desalinplant;

/**
 * Created by try on 2018/4/10.
 */
public interface DesalinplantFun {

    void updateDesalinplant(Desalinplant desalinplant);

    Desalinplant selectDesalinplantById(int id);

}
