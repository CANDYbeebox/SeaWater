package com.sea.control;

import com.sea.entity.Desalinplant;
import com.sea.entity.RunningRecordEntity;
import com.sea.service.RunningRecordFun;
import org.apache.tools.ant.taskdefs.optional.extension.LibFileSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by try on 2018/5/3.
 */
@Controller
@RequestMapping("/runningrecord")
public class RunningRecordControl {
    Logger log = LoggerFactory.getLogger(WindElectricControl.class);

    @Autowired
    RunningRecordFun rFun;

    @ResponseBody
    @RequestMapping(value = "/getsession", produces = "application/text;charset=utf-8")
    public String getSession(HttpSession session) {
        if (session.getAttribute("id") == null) {
            return "error";
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/getrecord", produces = "application/json;charset=utf-8")
    public List<RunningRecordEntity> getRecord(long timelong, HttpSession session) {
        Timestamp low = new Timestamp(timelong - 3600 * 1000L);
        Timestamp high = new Timestamp(timelong);
        int id = 0;
        if (session.getAttribute("id") != null) {
            id = (int)session.getAttribute("id");
        }
        String name = "";
        switch (id) {
            case 1:name = "runningrecordyancheng";break;
            case 2:name = "runningrecordhainan";break;
        }
        List<RunningRecordEntity> ret = new ArrayList<>();
        try {
            ret = rFun.selectRecord(low, high, name);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return ret;
    }

}
