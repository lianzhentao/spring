package com.java.springboot.services;

import com.java.springboot.bean.LcUser;

public interface LcUserService {

    LcUser getUserInfo(String userName,String password);

    int insertUser(String userName,String password);
}
