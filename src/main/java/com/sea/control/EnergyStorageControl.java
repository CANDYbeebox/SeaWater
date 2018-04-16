package com.sea.control;

import com.exception.NullException;
import com.exception.updateException;
import com.sea.entity.BatteryPack;
import com.sea.entity.EnergyStorageConverter;
import com.sea.service.BatteryPackFun;
import com.sea.service.EnergyStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by try on 2018/3/31.
 */
@Controller
@RequestMapping("/savepower")
public class EnergyStorageControl {
    Logger log = LoggerFactory.getLogger(WindElectricControl.class);


    @Autowired
    EnergyStorage energyStorage;

    @Autowired
    BatteryPackFun batteryPackFun;

    EnergyStorageConverter energyStorageConverter = new EnergyStorageConverter(1, "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1");

    BatteryPack batteryPack = new BatteryPack(1, "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1");

    @ResponseBody
    @RequestMapping(value = "/setenergystorage", produces = "application/text;charset=utf-8")
    public String setEnergyData(EnergyStorageConverter e) {
        log.info("输出为{}", e);
        energyStorageConverter.setId(e.getId());
        if (e.getPcsAdd2000() != null) {
            energyStorageConverter.setPcsAdd2000(e.getPcsAdd2000());
        }
        if (e.getPcsAdd2001() != null) {
            energyStorageConverter.setPcsAdd2001(e.getPcsAdd2001());
        }
        if (e.getPcsAdd2002() != null) {
            energyStorageConverter.setPcsAdd2002(e.getPcsAdd2002());
        }
        if (e.getPcsAdd2003() != null) {
            energyStorageConverter.setPcsAdd2003(e.getPcsAdd2003());
        }
        if (e.getPcsAdd2004() != null) {
            energyStorageConverter.setPcsAdd2004(e.getPcsAdd2004());
        }
        if (e.getPcsAdd2005() != null) {
            energyStorageConverter.setPcsAdd2005(e.getPcsAdd2005());
        }
        if (e.getPcsAdd2006() != null) {
            energyStorageConverter.setPcsAdd2006(e.getPcsAdd2006());
        }
        if (e.getPcsAdd2007() != null) {
            energyStorageConverter.setPcsAdd2007(e.getPcsAdd2007());
        }
        if (e.getPcsAdd2008() != null) {
            energyStorageConverter.setPcsAdd2008(e.getPcsAdd2008());
        }
        if (e.getPcsAdd2009() != null) {
            energyStorageConverter.setPcsAdd2009(e.getPcsAdd2009());
        }
        if (e.getPcsAdd2010() != null) {
            energyStorageConverter.setPcsAdd2010(e.getPcsAdd2010());
        }
        if (e.getPcsAdd2011() != null) {
            energyStorageConverter.setPcsAdd2011(e.getPcsAdd2011());
        }

        if (e.getPcsAdd2012Bit0Val0() != null) {
            energyStorageConverter.setPcsAdd2012Bit0Val0(e.getPcsAdd2012Bit0Val0());
        }
        if (e.getPcsAdd2012Bit0Val1() != null) {
            energyStorageConverter.setPcsAdd2012Bit0Val1(e.getPcsAdd2012Bit0Val1());
        }
        if (e.getPcsAdd2012Bit0Val2() != null) {
            energyStorageConverter.setPcsAdd2012Bit0Val2(e.getPcsAdd2012Bit0Val2());
        }

        if (e.getPcsAdd2012Bit4Val0() != null) {
            energyStorageConverter.setPcsAdd2012Bit4Val0(e.getPcsAdd2012Bit4Val0());
        }
        if (e.getPcsAdd2012Bit4Val2() != null) {
            energyStorageConverter.setPcsAdd2012Bit4Val2(e.getPcsAdd2012Bit4Val2());
        }

        if (e.getPcsAdd2012Bit12Val0() != null) {
            energyStorageConverter.setPcsAdd2012Bit12Val0(e.getPcsAdd2012Bit12Val0());
        }
        if (e.getPcsAdd2012Bit12Val1() != null) {
            energyStorageConverter.setPcsAdd2012Bit12Val1(e.getPcsAdd2012Bit12Val1());
        }
        if (e.getPcsAdd2012Bit12Val2() != null) {
            energyStorageConverter.setPcsAdd2012Bit12Val2(e.getPcsAdd2012Bit12Val2());
        }
        if (e.getPcsAdd2012Bit12Val3() != null) {
            energyStorageConverter.setPcsAdd2012Bit12Val3(e.getPcsAdd2012Bit12Val3());
        }
        if (e.getPcsAdd2012Bit12Val4() != null) {
            energyStorageConverter.setPcsAdd2012Bit12Val4(e.getPcsAdd2012Bit12Val4());
        }
        if (e.getPcsAdd2012Bit12Val5() != null) {
            energyStorageConverter.setPcsAdd2012Bit12Val5(e.getPcsAdd2012Bit12Val5());
        }


        if (e.getPcsAdd2014Bit0() != null) {
            energyStorageConverter.setPcsAdd2014Bit0(e.getPcsAdd2014Bit0());
        }
        if (e.getPcsAdd2014Bit1() != null) {
            energyStorageConverter.setPcsAdd2014Bit1(e.getPcsAdd2014Bit1());
        }
        if (e.getPcsAdd2014Bit2() != null) {
            energyStorageConverter.setPcsAdd2014Bit2(e.getPcsAdd2014Bit2());
        }
        if (e.getPcsAdd2014Bit3() != null) {
            energyStorageConverter.setPcsAdd2014Bit3(e.getPcsAdd2014Bit3());
        }
        if (e.getPcsAdd2014Bit4() != null) {
            energyStorageConverter.setPcsAdd2014Bit4(e.getPcsAdd2014Bit4());
        }
        if (e.getPcsAdd2014Bit5() != null) {
            energyStorageConverter.setPcsAdd2014Bit5(e.getPcsAdd2014Bit5());
        }
        if (e.getPcsAdd2014Bit6() != null) {
            energyStorageConverter.setPcsAdd2014Bit6(e.getPcsAdd2014Bit6());
        }
        if (e.getPcsAdd2014Bit7() != null) {
            energyStorageConverter.setPcsAdd2014Bit7(e.getPcsAdd2014Bit7());
        }
        if (e.getPcsAdd2014Bit8() != null) {
            energyStorageConverter.setPcsAdd2014Bit8(e.getPcsAdd2014Bit8());
        }
        if (e.getPcsAdd2014Bit9() != null) {
            energyStorageConverter.setPcsAdd2014Bit9(e.getPcsAdd2014Bit9());
        }
        if (e.getPcsAdd2014Bit10() != null) {
            energyStorageConverter.setPcsAdd2014Bit10(e.getPcsAdd2014Bit10());
        }
        if (e.getPcsAdd2014Bit11() != null) {
            energyStorageConverter.setPcsAdd2014Bit11(e.getPcsAdd2014Bit11());
        }
        if (e.getPcsAdd2014Bit12() != null) {
            energyStorageConverter.setPcsAdd2014Bit12(e.getPcsAdd2014Bit12());
        }
        if (e.getPcsAdd2014Bit13() != null) {
            energyStorageConverter.setPcsAdd2014Bit13(e.getPcsAdd2014Bit13());
        }
        if (e.getPcsAdd2014Bit14() != null) {
            energyStorageConverter.setPcsAdd2014Bit14(e.getPcsAdd2014Bit14());
        }
        if (e.getPcsAdd2014Bit15() != null) {
            energyStorageConverter.setPcsAdd2014Bit15(e.getPcsAdd2014Bit15());
        }
        if (e.getPcsAdd2015Bit0() != null) {
            energyStorageConverter.setPcsAdd2015Bit0(e.getPcsAdd2015Bit0());
        }
        log.info("输出为{}", energyStorageConverter);
        try {
            energyStorage.updateEnergyStorage(energyStorageConverter);
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
            return "更新储流器失败";
        }
        return "储流器更新成功";

    }

    @ResponseBody
    @RequestMapping(value = "/getenergystorage", produces = "application/json;charset=utf-8")
    public EnergyStorageConverter getEnergyData(HttpSession session) {
        EnergyStorageConverter ret = new EnergyStorageConverter();
        int id = (int)session.getAttribute("id");
        try {
            ret = energyStorage.selectEnergyStorageById(id);
            System.out.println(ret);
        } catch (NullException e) {
            log.error(e.getMessage());
        }
        return ret;
    }


    @ResponseBody
    @RequestMapping(value = "/setbattery", produces = "application/text;charset=utf-8")
    public String setBatteryData(BatteryPack b) {
        log.info("输入{}", b);
        batteryPack.setId(b.getId());
        if (b.getBmsAdd0004() != null) {
            batteryPack.setBmsAdd0004(b.getBmsAdd0004());
        }
        if (b.getBmsAdd0005() != null) {
            batteryPack.setBmsAdd0005(b.getBmsAdd0005());
        }
        if (b.getBmsAdd0006() != null) {
            batteryPack.setBmsAdd0006(b.getBmsAdd0006());
        }
        if (b.getBmsAdd0007() != null) {
            batteryPack.setBmsAdd0007(b.getBmsAdd0007());
        }
        if (b.getBmsAdd0008() != null) {
            batteryPack.setBmsAdd0008(b.getBmsAdd0008());
        }
        if (b.getBmsAdd0009() != null) {
            batteryPack.setBmsAdd0009(b.getBmsAdd0009());
        }
        if (b.getBmsAdd0010() != null) {
            batteryPack.setBmsAdd0010(b.getBmsAdd0010());
        }
        if (b.getBmsAdd0011() != null) {
            batteryPack.setBmsAdd0011(b.getBmsAdd0011());
        }
        if (b.getBmsAdd0012() != null) {
            batteryPack.setBmsAdd0012(b.getBmsAdd0012());
        }
        if (b.getBmsAdd0013() != null) {
            batteryPack.setBmsAdd0013(b.getBmsAdd0013());
        }
        if (b.getBmsAdd0014() != null) {
            batteryPack.setBmsAdd0014(b.getBmsAdd0014());
        }
        if (b.getBmsAdd0015() != null) {
            batteryPack.setBmsAdd0015(b.getBmsAdd0015());
        }
        if (b.getBmsAdd0016() != null) {
            batteryPack.setBmsAdd0016(b.getBmsAdd0016());
        }
        if (b.getBmsAdd0017() != null) {
            batteryPack.setBmsAdd0017(b.getBmsAdd0017());
        }
        if (b.getBmsAdd0018() != null) {
            batteryPack.setBmsAdd0018(b.getBmsAdd0018());
        }
        if (b.getBmsAdd0019() != null) {
            batteryPack.setBmsAdd0019(b.getBmsAdd0019());
        }
        if (b.getBmsAdd0020() != null) {
            batteryPack.setBmsAdd0020(b.getBmsAdd0020());
        }
        if (b.getBmsAdd0021() != null) {
            batteryPack.setBmsAdd0021(b.getBmsAdd0021());
        }
        if (b.getBmsAdd0022() != null) {
            batteryPack.setBmsAdd0022(b.getBmsAdd0022());
        }
        if (b.getBmsAdd0023() != null) {
            batteryPack.setBmsAdd0023(b.getBmsAdd0023());
        }
        if (b.getBmsAdd0024() != null) {
            batteryPack.setBmsAdd0024(b.getBmsAdd0024());
        }
        if (b.getBmsAdd0025() != null) {
            batteryPack.setBmsAdd0025(b.getBmsAdd0025());
        }
        if (b.getBmsAdd0026() != null) {
            batteryPack.setBmsAdd0026(b.getBmsAdd0026());
        }
        if (b.getBmsAdd0027() != null) {
            batteryPack.setBmsAdd0027(b.getBmsAdd0027());
        }
        if (b.getBmsAdd0028() != null) {
            batteryPack.setBmsAdd0028(b.getBmsAdd0028());
        }
        if (b.getBmsAdd0029() != null) {
            batteryPack.setBmsAdd0029(b.getBmsAdd0029());
        }
        if (b.getBmsAdd0001Bit1() != null) {
            batteryPack.setBmsAdd0001Bit1(b.getBmsAdd0001Bit1());
        }
        if (b.getBmsAdd0001Bit2Val0() != null) {
            batteryPack.setBmsAdd0001Bit2Val0(b.getBmsAdd0001Bit2Val0());
        }
        if (b.getBmsAdd0001Bit2Val1() != null) {
            batteryPack.setBmsAdd0001Bit2Val1(b.getBmsAdd0001Bit2Val1());
        }
        if (b.getBmsAdd0001Bit3() != null) {
            batteryPack.setBmsAdd0001Bit3(b.getBmsAdd0001Bit3());
        }
        if (b.getBmsAdd0001Bit4() != null) {
            batteryPack.setBmsAdd0001Bit4(b.getBmsAdd0001Bit4());
        }
        if (b.getBmsAdd0001Bit5() != null) {
            batteryPack.setBmsAdd0001Bit5(b.getBmsAdd0001Bit5());
        }
        if (b.getBmsAdd0001Bit6() != null) {
            batteryPack.setBmsAdd0001Bit6(b.getBmsAdd0001Bit6());
        }
        if (b.getBmsAdd0002Bit0() != null) {
            batteryPack.setBmsAdd0002Bit0(b.getBmsAdd0002Bit0());
        }
        if (b.getBmsAdd0002Bit1() != null) {
            batteryPack.setBmsAdd0002Bit1(b.getBmsAdd0002Bit1());
        }
        if (b.getBmsAdd0002Bit2() != null) {
            batteryPack.setBmsAdd0002Bit2(b.getBmsAdd0002Bit2());
        }
        if (b.getBmsAdd0002Bit3() != null) {
            batteryPack.setBmsAdd0002Bit3(b.getBmsAdd0002Bit3());
        }
        if (b.getBmsAdd0002Bit4() != null) {
            batteryPack.setBmsAdd0002Bit4(b.getBmsAdd0002Bit4());
        }
        if (b.getBmsAdd0002Bit5() != null) {
            batteryPack.setBmsAdd0002Bit5(b.getBmsAdd0002Bit5());
        }
        if (b.getBmsAdd0002Bit6() != null) {
            batteryPack.setBmsAdd0002Bit6(b.getBmsAdd0002Bit6());
        }
        if (b.getBmsAdd0002Bit7() != null) {
            batteryPack.setBmsAdd0002Bit7(b.getBmsAdd0002Bit7());
        }
        if (b.getBmsAdd0002Bit8() != null) {
            batteryPack.setBmsAdd0002Bit8(b.getBmsAdd0002Bit8());
        }
        if (b.getBmsAdd0002Bit9() != null) {
            batteryPack.setBmsAdd0002Bit9(b.getBmsAdd0002Bit9());
        }
        log.info("现在{}", batteryPack);
        try {
            batteryPackFun.updateBatteryPack(batteryPack);
        } catch (updateException e) {
            log.error(e.getMessage());
            return "error";
        }
        return "success";
    }


    @ResponseBody
    @RequestMapping(value = "/getbattery", produces = "application/json;charset=utf-8")
    public BatteryPack getBatteryData(HttpSession session) {
        System.out.println("sss");
        int id = (int)session.getAttribute("id");
        System.out.println(id);
        BatteryPack ret = new BatteryPack();
        try {
            ret = batteryPackFun.selectBatteryPackById(id);
        } catch (NullException e) {
            log.error(e.getMessage());
        }
        return ret;
    }
}
