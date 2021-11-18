package com.signserviceprovider;

import com.signserviceprovider.dao.RegisteredSchoolMapper;
import com.signserviceprovider.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SignServiceProviderApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Resource
    private RegisteredSchoolMapper registeredSchoolMapper;

    @Test
    void contextLoads() {
        System.out.println(registeredSchoolMapper.selectAll().toString());
    }


}
