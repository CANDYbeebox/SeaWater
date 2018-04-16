package com.sea.control;

import com.sea.entity.Desalinplant;
import com.sea.service.DesalinplantFun;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by try on 2018/4/11.
 */
@Controller
@RequestMapping("/desalinplant")
public class DesalinplantControl {
    Logger log = LoggerFactory.getLogger(WindElectricControl.class);

    @Autowired
    DesalinplantFun desalinplantFun;

    Desalinplant desalinplant = new Desalinplant(1, "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1", "1");

    @ResponseBody
    @RequestMapping(value = "/setdata", produces = "application/text;charset=utf-8")
    public String setDesalinplantData(Desalinplant d) {
        log.info("输出为{}", d);
        desalinplant.setId(d.getId());
        if (d.getDesalinplantAdd1007() != null) {
            desalinplant.setDesalinplantAdd1007(d.getDesalinplantAdd1007());
        }
        if (d.getDesalinplantAdd1008() != null) {
            desalinplant.setDesalinplantAdd1008(d.getDesalinplantAdd1008());
        }
        if (d.getDesalinplantAdd1009() != null) {
            desalinplant.setDesalinplantAdd1009(d.getDesalinplantAdd1009());
        }
        if (d.getDesalinplantAdd1010() != null) {
            desalinplant.setDesalinplantAdd1010(d.getDesalinplantAdd1010());
        }
        if (d.getDesalinplantAdd1011() != null) {
            desalinplant.setDesalinplantAdd1011(d.getDesalinplantAdd1011());
        }
        if (d.getDesalinplantAdd1013() != null) {
            desalinplant.setDesalinplantAdd1013(d.getDesalinplantAdd1013());
        }
        if (d.getDesalinplantAdd1014() != null) {
            desalinplant.setDesalinplantAdd1014(d.getDesalinplantAdd1014());
        }
        if (d.getDesalinplantAdd1015() != null) {
            desalinplant.setDesalinplantAdd1015(d.getDesalinplantAdd1015());
        }
        if (d.getDesalinplantAdd1016() != null) {
            desalinplant.setDesalinplantAdd1016(d.getDesalinplantAdd1016());
        }
        if (d.getDesalinplantAdd1018() != null) {
            desalinplant.setDesalinplantAdd1018(d.getDesalinplantAdd1018());
        }

        if (d.getDesalinplantAdd1002Bit0Val0() != null) {
            desalinplant.setDesalinplantAdd1002Bit0Val0(d.getDesalinplantAdd1002Bit0Val0());
        }
        if (d.getDesalinplantAdd1002Bit0Val1() != null) {
            desalinplant.setDesalinplantAdd1002Bit0Val1(d.getDesalinplantAdd1002Bit0Val1());
        }

        if (d.getDesalinplantAdd1001Bit0() != null) {
            desalinplant.setDesalinplantAdd1001Bit0(d.getDesalinplantAdd1001Bit0());
        }
        if (d.getDesalinplantAdd1001Bit1() != null) {
            desalinplant.setDesalinplantAdd1001Bit1(d.getDesalinplantAdd1001Bit1());
        }
        if (d.getDesalinplantAdd1001Bit2() != null) {
            desalinplant.setDesalinplantAdd1001Bit2(d.getDesalinplantAdd1001Bit2());
        }
        if (d.getDesalinplantAdd1001Bit3() != null) {
            desalinplant.setDesalinplantAdd1001Bit3(d.getDesalinplantAdd1001Bit3());
        }
        if (d.getDesalinplantAdd1001Bit4() != null) {
            desalinplant.setDesalinplantAdd1001Bit4(d.getDesalinplantAdd1001Bit4());
        }
        if (d.getDesalinplantAdd1001Bit5() != null) {
            desalinplant.setDesalinplantAdd1001Bit5(d.getDesalinplantAdd1001Bit5());
        }
        if (d.getDesalinplantAdd1001Bit6() != null) {
            desalinplant.setDesalinplantAdd1001Bit6(d.getDesalinplantAdd1001Bit6());
        }
        if (d.getDesalinplantAdd1001Bit7() != null) {
            desalinplant.setDesalinplantAdd1001Bit7(d.getDesalinplantAdd1001Bit7());
        }

        if (d.getDesalinplantAdd1003Bit0() != null) {
            desalinplant.setDesalinplantAdd1003Bit0(d.getDesalinplantAdd1003Bit0());
        }
        if (d.getDesalinplantAdd1003Bit1() != null) {
            desalinplant.setDesalinplantAdd1003Bit1(d.getDesalinplantAdd1003Bit1());
        }
        if (d.getDesalinplantAdd1003Bit2() != null) {
            desalinplant.setDesalinplantAdd1003Bit2(d.getDesalinplantAdd1003Bit2());
        }
        if (d.getDesalinplantAdd1003Bit3() != null) {
            desalinplant.setDesalinplantAdd1003Bit3(d.getDesalinplantAdd1003Bit3());
        }
        if (d.getDesalinplantAdd1003Bit4() != null) {
            desalinplant.setDesalinplantAdd1003Bit4(d.getDesalinplantAdd1003Bit4());
        }
        if (d.getDesalinplantAdd1003Bit5() != null) {
            desalinplant.setDesalinplantAdd1003Bit5(d.getDesalinplantAdd1003Bit5());
        }
        if (d.getDesalinplantAdd1003Bit6() != null) {
            desalinplant.setDesalinplantAdd1003Bit6(d.getDesalinplantAdd1003Bit6());
        }
        if (d.getDesalinplantAdd1003Bit7() != null) {
            desalinplant.setDesalinplantAdd1003Bit7(d.getDesalinplantAdd1003Bit7());
        }

        if (d.getDesalinplantAdd1004Bit0() != null) {
            desalinplant.setDesalinplantAdd1004Bit0(d.getDesalinplantAdd1004Bit0());
        }
        if (d.getDesalinplantAdd1004Bit1() != null) {
            desalinplant.setDesalinplantAdd1004Bit1(d.getDesalinplantAdd1004Bit1());
        }
        if (d.getDesalinplantAdd1004Bit2() != null) {
            desalinplant.setDesalinplantAdd1004Bit2(d.getDesalinplantAdd1004Bit2());
        }
        if (d.getDesalinplantAdd1004Bit3() != null) {
            desalinplant.setDesalinplantAdd1004Bit3(d.getDesalinplantAdd1004Bit3());
        }
        if (d.getDesalinplantAdd1004Bit4() != null) {
            desalinplant.setDesalinplantAdd1004Bit4(d.getDesalinplantAdd1004Bit4());
        }
        if (d.getDesalinplantAdd1004Bit5() != null) {
            desalinplant.setDesalinplantAdd1004Bit5(d.getDesalinplantAdd1004Bit5());
        }
        if (d.getDesalinplantAdd1004Bit6() != null) {
            desalinplant.setDesalinplantAdd1004Bit6(d.getDesalinplantAdd1004Bit6());
        }
        if (d.getDesalinplantAdd1004Bit7() != null) {
            desalinplant.setDesalinplantAdd1004Bit7(d.getDesalinplantAdd1004Bit7());
        }
        log.info("输出为{}", desalinplant);
        try {
            desalinplantFun.updateDesalinplant(desalinplant);
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
            return "更新海淡设备失败";
        }
        return "海淡设备数据更新成功";
    }

}
