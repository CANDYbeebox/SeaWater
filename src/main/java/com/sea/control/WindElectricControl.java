package com.sea.control;

import com.sea.entity.WindElectricEntity;
import com.sea.entity.WindEletricTwoEntity;
import com.sea.service.Wind;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by try on 2018/3/6.
 */
@Controller
@RequestMapping("/wind")
public class WindElectricControl {
    Logger log = LoggerFactory.getLogger(WindElectricControl.class);
    WindElectricEntity windOne = new WindElectricEntity(1,
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1", "1", "1", "1",
            "1", "1");

    WindEletricTwoEntity windTwo = new WindEletricTwoEntity(1,"1","1","1","1",
            "1","1","1","1","1",
            "1", "1","1","1","1",
            "1","1","1","1","1",
            "1","1","1","1");

    @Autowired
    Wind wind;


    @ResponseBody
    @RequestMapping(value = "/setone", produces = "application/text;charset=utf-8")
    public String setWindOne(WindElectricEntity w) {
//        if (windElectricEntity == null) {
//            log.error("对象为空");
//            return "空对象";
//        }
//        log.info("输出为{}", windElectricEntity);
        log.info("输出为{}", w);
        windOne.setId(w.getId());
        if (w.getWindturb1_40007() != null) {
            windOne.setWindturb1_40007(w.getWindturb1_40007());
        }
        if (w.getWindturb1_40005() != null) {
            windOne.setWindturb1_40005(w.getWindturb1_40005());
        }
        if (w.getWindturb1_40006() != null) {
            windOne.setWindturb1_40006(w.getWindturb1_40006());
        }
        if (w.getWindturb1_40008() != null) {
            windOne.setWindturb1_40008(w.getWindturb1_40008());
        }
        if (w.getWindturb1_40009() != null) {
            windOne.setWindturb1_40009(w.getWindturb1_40009());
        }
        if (w.getWindturb1_40260() != null) {
            windOne.setWindturb1_40260(w.getWindturb1_40260());
        }
        if (w.getWindturb1_40071() != null) {
            windOne.setWindturb1_40071(w.getWindturb1_40071());
        }
        if (w.getWindturb1_40072() != null) {
            windOne.setWindturb1_40072(w.getWindturb1_40072());
        }
        if (w.getWindturb1_40075() != null) {
            windOne.setWindturb1_40075(w.getWindturb1_40075());
        }
        if (w.getWindturb1_40065() != null) {
            windOne.setWindturb1_40065(w.getWindturb1_40065());
        }
        if (w.getWindturb1_40066() != null) {
            windOne.setWindturb1_40066(w.getWindturb1_40066());
        }
        if (w.getWindturb1_40067() != null) {
            windOne.setWindturb1_40067(w.getWindturb1_40067());
        }
        if (w.getWindturb1_40068() != null) {
            windOne.setWindturb1_40068(w.getWindturb1_40068());
        }
        if (w.getWindturb1_40069() != null) {
            windOne.setWindturb1_40069(w.getWindturb1_40069());
        }
        if (w.getWindturb1_40070() != null) {
            windOne.setWindturb1_40070(w.getWindturb1_40070());
        }
        if (w.getWindturb1_40073() != null) {
            windOne.setWindturb1_40073(w.getWindturb1_40073());
        }
        if (w.getWindturb1_40001_1() != null) {
            windOne.setWindturb1_40001_1(w.getWindturb1_40001_1());
        }
        if (w.getWindturb1_40003_1() != null) {
            windOne.setWindturb1_40003_1(w.getWindturb1_40003_1());
        }
        if (w.getWindturb1_40001_2() != null) {
            windOne.setWindturb1_40001_2(w.getWindturb1_40001_2());
        }
        if (w.getWindturb1_40003_2() != null) {
            windOne.setWindturb1_40003_2(w.getWindturb1_40003_2());
        }
        if (w.getWindturb1_40002_1() != null) {
            windOne.setWindturb1_40002_1(w.getWindturb1_40002_1());
        }
        if (w.getWindturb1_40003_3() != null) {
            windOne.setWindturb1_40003_3(w.getWindturb1_40003_3());
        }
        if (w.getWindturb1_40002_2() != null) {
            windOne.setWindturb1_40002_2(w.getWindturb1_40002_2());
        }
        if (w.getWindturb1_40003_4() != null) {
            windOne.setWindturb1_40003_4(w.getWindturb1_40003_4());
        }
        if (w.getWindturb1_40002_3() != null) {
            windOne.setWindturb1_40002_3(w.getWindturb1_40002_3());
        }
        if (w.getWindturb1_40003_5() != null) {
            windOne.setWindturb1_40003_5(w.getWindturb1_40003_5());
        }
        if (w.getWindturb1_40002_4() != null) {
            windOne.setWindturb1_40002_4(w.getWindturb1_40002_4());
        }
        if (w.getWindturb1_40003_6() != null) {
            windOne.setWindturb1_40003_6(w.getWindturb1_40003_6());
        }
        if (w.getWindturb1_40261() != null) {
            windOne.setWindturb1_40261(w.getWindturb1_40261());
        }
        if (w.getWindturb1_40010_2() != null) {
            windOne.setWindturb1_40010_2(w.getWindturb1_40010_2());
        }
        if (w.getWindturb1_40010_5() != null) {
            windOne.setWindturb1_40010_5(w.getWindturb1_40010_5());
        }
        if (w.getWindturb1_40010_0() != null) {
            windOne.setWindturb1_40010_0(w.getWindturb1_40010_0());
        }
        if (w.getWindturb1_40010_3() != null) {
            windOne.setWindturb1_40010_3(w.getWindturb1_40010_3());
        }
        if (w.getWindturb1_40010_6() != null) {
            windOne.setWindturb1_40010_6(w.getWindturb1_40010_6());
        }
        if (w.getWindturb1_40010_1() != null) {
            windOne.setWindturb1_40010_1(w.getWindturb1_40010_1());
        }
        if (w.getWindturb1_40010_4() != null) {
            windOne.setWindturb1_40010_4(w.getWindturb1_40010_4());
        }
        if (w.getWindturb1_40010_7() != null) {
            windOne.setWindturb1_40010_7(w.getWindturb1_40010_7());
        }
        log.info("输出为{}", windOne);
        try {
            wind.updateWindOne(windOne);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "更新失败";
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/settwo", produces = "application/text;charset=utf-8")
    public String setWindTwo(WindEletricTwoEntity w) {
        log.info("输出为{}", w);
        windTwo.setId(w.getId());
        if (w.getWindturb2Add0000() != null) {
            windTwo.setWindturb2Add0000(w.getWindturb2Add0000());
        }
        if (w.getWindturb2Add0001() != null) {
            windTwo.setWindturb2Add0001(w.getWindturb2Add0001());
        }
        if (w.getWindturb2Add0002() != null) {
            windTwo.setWindturb2Add0002(w.getWindturb2Add0002());
        }
        if (w.getWindturb2Add0003() != null) {
            windTwo.setWindturb2Add0003(w.getWindturb2Add0003());
        }
        if (w.getWindturb2Add0004() != null) {
            windTwo.setWindturb2Add0004(w.getWindturb2Add0004());
        }
        if (w.getWindturb2Add0005() != null) {
            windTwo.setWindturb2Add0005(w.getWindturb2Add0005());
        }
        if (w.getWindturb2Add0006() != null) {
            windTwo.setWindturb2Add0006(w.getWindturb2Add0006());
        }
        if (w.getWindturb2Add0007() != null) {
            windTwo.setWindturb2Add0007(w.getWindturb2Add0007());
        }
        if (w.getWindturb2Add0008() != null) {
            windTwo.setWindturb2Add0008(w.getWindturb2Add0008());
        }
        if (w.getWindturb2Add0010Bit0() != null) {
            windTwo.setWindturb2Add0010Bit0(w.getWindturb2Add0010Bit0());
        }
        if (w.getWindturb2Add0010Bit1() != null) {
            windTwo.setWindturb2Add0010Bit1(w.getWindturb2Add0010Bit1());
        }
        if (w.getWindturb2Add0010Bit2() != null) {
            windTwo.setWindturb2Add0010Bit2(w.getWindturb2Add0010Bit2());
        }
        if (w.getWindturb2Add0010Bit3() != null) {
            windTwo.setWindturb2Add0010Bit3(w.getWindturb2Add0010Bit3());
        }
        if (w.getWindturb2Add0010Bit4() != null) {
            windTwo.setWindturb2Add0010Bit4(w.getWindturb2Add0010Bit4());
        }
        if (w.getWindturb2Add0010Bit5() != null) {
            windTwo.setWindturb2Add0010Bit5(w.getWindturb2Add0010Bit5());
        }
        if (w.getWindturb2Add0010Bit6() != null) {
            windTwo.setWindturb2Add0010Bit6(w.getWindturb2Add0010Bit6());
        }
        if (w.getWindturb2Add0034() != null) {
            windTwo.setWindturb2Add0034(w.getWindturb2Add0034());
        }
        log.info("输出为{}", windTwo);
        try {
            wind.updateWindTwo(windTwo);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return "更新风机2失败";
        }
        return "风机2更新成功";
    }

}
