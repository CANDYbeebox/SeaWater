package com.sea.control;

import com.exception.updateException;
import com.sea.entity.EnergyStorageConverter;
import com.sea.entity.RequestBodyEntity;
import com.sea.service.CommonUpdateFun;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by try on 2018/7/23.
 */
@Controller
public class CommonUpdateControl {
    @Autowired
    CommonUpdateFun commonUpdateFun;

    Logger log = LoggerFactory.getLogger(WindElectricControl.class);


    @ResponseBody
    @RequestMapping(value = "/update", produces = "application/text;charset=utf-8")
    public String updateOneProperty(RequestBodyEntity requestBodyEntity) {
        try {
            commonUpdateFun.updateOneProperty(requestBodyEntity);
        } catch (updateException e) {
            log.error("更新数据失败");
            return "error";
        }
        return "success";
    }


}
