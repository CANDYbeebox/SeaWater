package com.sea.control;

import com.sea.entity.CompanyEntity;
import com.sea.entity.UserEntity;
import com.sea.service.UserFun;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by try on 2018/3/23.
 */
@Controller
@RequestMapping("/user")
public class UserControl {
    @Autowired
    UserFun userFun;
    Logger log = LoggerFactory.getLogger(UserControl.class);


    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @RequestMapping(value = "/companygetter", produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<CompanyEntity> getDompany() {
        List<CompanyEntity> ret = userFun.getCompany();
        return ret;
    }

    @RequestMapping("/mapsessionsetter")
    @ResponseBody
    public String setSessionId(int id, HttpSession session) {
        session.setAttribute("id", id);
        return "success";
    }


    @RequestMapping(value = "/usermessage")
    @ResponseBody
    public String getUserMessage() {
        String currentUsername = (String)SecurityUtils.getSubject().getPrincipal();
        return currentUsername;
    }

}
