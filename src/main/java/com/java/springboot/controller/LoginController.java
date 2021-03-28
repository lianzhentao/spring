package com.java.springboot.controller;

import com.java.springboot.bean.LcUser;
import com.java.springboot.services.LcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private LcUserService lcUserService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        LcUser user = lcUserService.getUserInfo(name,password);
        if(user != null){
            return "success";
        }else{
            return "error";
        }
    }

    @RequestMapping(value = "/registerIn",method = RequestMethod.POST)
    public String registerIn(String name,String password){
        int result = lcUserService.insertUser(name,password);
        if(result > 0){
            return "successRegister";
        }else{
            return "errorRegister";
        }

    }
}
