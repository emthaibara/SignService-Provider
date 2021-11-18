package com.signserviceprovider.advice;

import com.signserviceprovider.controller.SignController;
import com.signserviceprovider.dao.RegisteredSchoolMapper;
import com.signserviceprovider.pojo.RegisteredSchool;
import com.signserviceprovider.util.ValidatorUtils;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:SCBC_LiYongJie
 * @time:2021/11/12
 */
@Aspect
@Component
public class GlobalAopAdvice {

    @Resource
    private RegisteredSchoolMapper registeredSchoolMapper;

    private static final Logger log = LoggerFactory.getLogger(GlobalAopAdvice.class);

    @After("com.signserviceprovider.aspect.SystemArchitecture.checkSchoolPointcut())")
    public void assemblyRegisteredSchoolMapper(){
        log.info("GlobalAopAdvice -- assemblyRegisteredSchoolMapper");
        ValidatorUtils.initialRegisteredSchoolMapper(registeredSchoolMapper);
    }
}
