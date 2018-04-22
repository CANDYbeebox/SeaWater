package com.sea.service.Impl;

import com.sea.service.RunningRecordFun;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by try on 2018/4/20.
 */
@Service
public class RunningRecordImpl implements RunningRecordFun {


    @Override
    @Scheduled(initialDelay=1000, fixedDelay=2000)
    public void test1() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("测试测试");
    }

    @Override
    @Scheduled(initialDelay=1000, fixedDelay=2000)
    public void test2() {
        System.out.println("second");
    }
}
