package com.java.springboot.services.impl;


import com.java.springboot.bean.LcUser;
import com.java.springboot.mapper.LcUserMapper;
import com.java.springboot.services.LcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LcUserServiceImpl implements LcUserService {

    @Autowired
    private LcUserMapper lcUserMapper;

    @Override
    public LcUser getUserInfo(String userName, String password) {
        return lcUserMapper.getUserInfo(userName,password);
    }

    @Override
    public int insertUser(String userName, String password) {
        LcUser user = new LcUser();
        user.setUserName(userName);
        user.setUserPassword(password);
        return lcUserMapper.insertUser(user);
    }

    public static void main(String[] args){
        System.out.println("hello word!");
        HashMap<String, String> map = new HashMap<>();
        map.put("String","mytest");
        System.out.println(map.get("String"));
    }
}
