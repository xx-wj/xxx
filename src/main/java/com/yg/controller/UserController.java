package com.yg.controller;

import com.yg.pojo.User;
import com.yg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.RequestWrapper;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/registerUser",method = RequestMethod.POST)
    public String registerUser(User user, Map<String,Object> map){

        int result=userService.registerUser(user);
        if(result!=1){
            map.put("code",500);
            map.put("msg","fail");
            return  "register";
        }
        map.put("code",200);
        map.put("msg","success");
        return "index";
    }
}
