package com.java.springboot.mapper;

import com.java.springboot.bean.LcUser;
import org.apache.ibatis.annotations.Param;

public interface LcUserMapper {

    LcUser getUserInfo(@Param("userName") String userName,@Param("password") String password);
    int insertUser(LcUser user);
}
