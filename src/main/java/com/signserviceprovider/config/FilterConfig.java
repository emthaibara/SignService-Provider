package com.signserviceprovider.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.signserviceprovider.filter.SignFilter;
import com.signserviceprovider.pojo.RegisteredSchool;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:SCBC_LiYongJie
 * @time:2021/11/15
 */

@Configuration
public class FilterConfig {

    @Resource
    private SignFilter signFilter;

    @Bean
    public FilterRegistrationBean<SignFilter> registerSignFilter(){
        FilterRegistrationBean<SignFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(signFilter);
        filterRegistrationBean.addUrlPatterns("/sharedkitchen/sign/a");
        return filterRegistrationBean;
    }

}

