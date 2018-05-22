package com.sea.control;

import com.exception.NullException;
import com.sea.entity.*;
import com.sea.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by try on 2018/5/14.
 */
@Controller
@RequestMapping("/phone")
public class PhoneController {
    Logger log = LoggerFactory.getLogger(UserControl.class);

    @Autowired
    Wind wind;

    @Autowired
    EnergyStorage energyStorage;

    @Autowired
    BatteryPackFun batteryPackFun;

    @Autowired
    DesalinplantFun desalinplantFun;

    @Autowired
    RunningRecordFun runningRecordFun;

    @ResponseBody
    @RequestMapping(value = "/windone", produces = "application/json;charset=utf-8")
    public WindElectricEntity getWindOne(int id) {
        WindElectricEntity ret = new WindElectricEntity();
        try {
            ret = wind.selectById(id);
            System.out.println(ret);
        } catch (NullException e) {
            log.error(e.getMessage());
        }
        return ret;
    }

    @ResponseBody
    @RequestMapping(value = "/windtwo", produces = "application/json;charset=utf-8")
    public WindEletricTwoEntity getWindTwo(int id) {
        WindEletricTwoEntity ret = new WindEletricTwoEntity();
        try {
            ret = wind.selectWindTwoById(id);
            System.out.println(ret);
        } catch (NullException e) {
            log.error(e.getMessage());
        }
        return ret;
    }

    @ResponseBody
    @RequestMapping(value = "/battery", produces = "application/json;charset=utf-8")
    public BatteryPack getBatteryData(int id) {
        BatteryPack ret = new BatteryPack();
        try {
            ret = batteryPackFun.selectBatteryPackById(id);
        } catch (NullException e) {
            log.error(e.getMessage());
        }
        return ret;
    }

    @ResponseBody
    @RequestMapping(value = "/energystorage", produces = "application/json;charset=utf-8")
    public EnergyStorageConverter getEnergyData(int id) {
        EnergyStorageConverter ret = new EnergyStorageConverter();
        try {
            ret = energyStorage.selectEnergyStorageById(id);
            System.out.println(ret);
        } catch (NullException e) {
            log.error(e.getMessage());
        }
        return ret;
    }

    @ResponseBody
    @RequestMapping(value = "/desalinplant", produces = "application/json;charset=utf-8")
    public Desalinplant getDesalinplantData(int id) {
        Desalinplant ret = new Desalinplant();
        try {
            ret = desalinplantFun.selectDesalinplantById(id);
        } catch (NullException e) {
            log.error(e.getMessage());
        }
        return ret;
    }

}
