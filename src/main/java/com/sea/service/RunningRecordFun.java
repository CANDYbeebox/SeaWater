package com.sea.service;

import com.sea.entity.RunningRecordEntity;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by try on 2018/4/20.
 */
public interface RunningRecordFun {

    List<RunningRecordEntity> selectRecord(Timestamp low, Timestamp high, String name);

    void insertRunningRecordPerMinute();
//    void test1();
//    void test2();

}
