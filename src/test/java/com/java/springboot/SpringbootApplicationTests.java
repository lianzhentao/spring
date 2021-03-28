package com.java.springboot;

import com.java.springboot.bean.LcUser;
import com.java.springboot.services.LcUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private LcUserService lcUserService;

    @Test
    void contextLoads() {
        LcUser user = lcUserService.getUserInfo("lzt","123");
        System.out.println("成功获取id"+user.getId());


    }

}
