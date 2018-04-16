package com.sea.dao;

import com.sea.entity.Desalinplant;

/**
 * Created by try on 2018/4/10.
 */
public interface DesalinplantDao {

    int updateDesalinplant(Desalinplant d);

    Desalinplant selectDesalinplantById(int id);

}
