package com.sea.service.Impl;

import com.exception.NullException;
import com.exception.updateException;
import com.sea.dao.DesalinplantDao;
import com.sea.entity.Desalinplant;
import com.sea.service.DesalinplantFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by try on 2018/4/10.
 */
@Service
public class DesalinplantImpl implements DesalinplantFun {
    @Autowired
    DesalinplantDao ddao;


    @Override
    public void updateDesalinplant(Desalinplant desalinplant) {
        int updateResult = ddao.updateDesalinplant(desalinplant);
        if (updateResult <= 0) {
            throw new updateException("更新淡化系统数据失败");
        }
    }

    @Override
    public Desalinplant selectDesalinplantById(int id) {
        Desalinplant d = ddao.selectDesalinplantById(id);
        if (d == null) {
            throw new NullException("没有id为" + id + "的淡化系统信息");
        }
        return d;
    }
}
