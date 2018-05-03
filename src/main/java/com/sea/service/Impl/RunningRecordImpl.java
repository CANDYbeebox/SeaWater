package com.sea.service.Impl;

import com.exception.NullException;
import com.sea.dao.*;
import com.sea.entity.*;
import com.sea.service.RunningRecordFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by try on 2018/4/20.
 */
@Service
public class RunningRecordImpl implements RunningRecordFun {
    @Autowired
    RunningRecordDao rDao;

    @Autowired
    WindDao wDao;

    @Autowired
    DesalinplantDao dDao;

    @Autowired
    EnergyStorageDao eDao;

    @Autowired
    UserDao uDao;


    //    @Override
//    @Scheduled(initialDelay=1000, fixedDelay=2000)
//    public void test1() {
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("测试测试");
//    }
//

    /**
     * 一分钟添加一次数据
     */
    @Override
    @Transactional
    @Scheduled(initialDelay = 1000, fixedDelay = 60000)
    public void insertRunningRecordPerMinute() {
        List<CompanyEntity> companyEntities = uDao.getCompany();
        List<Integer> ids = new ArrayList<>();
        for (CompanyEntity c : companyEntities) {
            if (c.getIsopen() == 1) {
                ids.add(c.getId());
            }
        }
        String name = "";
        for (int i : ids) {
            switch (i) {
                case 1: name = "runningrecordyancheng";break;
                case 2: name = "runningrecordhainan";break;
            }
            insertByID(i, name);
        }
    }

    private void insertByID(int id, String name) {
        WindElectricEntity windOne = wDao.selectById(id);
        WindEletricTwoEntity windTwo = wDao.selectWindTwoById(id);
        Desalinplant desalinplant = dDao.selectDesalinplantById(id);
        EnergyStorageConverter energyStorageConverter = eDao.selectEnergyStorageById(id);
        RunningRecordEntity r = new RunningRecordEntity();
        r.setOneSpeed(windOne.getWindturb1_40008());
        r.setOnePower(windOne.getWindturb1_40071());
        r.setTwoSpeed(windTwo.getWindturb2Add0000());
        r.setTwoPower(windTwo.getWindturb2Add0005());
        r.setDesalinationPower(desalinplant.getDesalinplantAdd1007());
        //需要修改
        r.setDesalinationYield(desalinplant.getDesalinplantAdd1001Bit0());
        r.setPcs(energyStorageConverter.getPcsAdd2007());
        rDao.insertRunningRecordPerMinute(r, name);
    }

    @Override
    public List<RunningRecordEntity> selectRecord(Timestamp low, Timestamp high, String name) {
        List<RunningRecordEntity> ret = rDao.selectByTime(low, high, name);
        if (ret == null) {
            throw new NullException("该时段没有数据");
        }
        return ret;
    }
}
