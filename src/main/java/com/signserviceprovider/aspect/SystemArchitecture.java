package com.signserviceprovider.aspect;

import com.signserviceprovider.dao.RegisteredSchoolMapper;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @Author:SCBC_LiYongJie
 * @time:2021/11/12
 */

@Aspect
@EnableAspectJAutoProxy
@Component
public class SystemArchitecture {

    @Pointcut("execution(* com.signserviceprovider.config.*.*(*))")
    public void checkSchoolPointcut(){

    }
}
