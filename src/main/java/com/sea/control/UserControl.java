package com.sea.control;

import com.sea.entity.UserEntity;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;

/**
 * Created by try on 2018/3/23.
 */
@Controller
@RequestMapping("/user")
public class UserControl {
    Logger log = LoggerFactory.getLogger(UserControl.class);


    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try{
            subject.login(token);
            return "success";
        }catch(Exception e){
            e.printStackTrace();
            return "error";
        }
    }


}
