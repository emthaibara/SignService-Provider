package com.signserviceprovider.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.signserviceprovider.exception.BaseException;
import com.signserviceprovider.pojo.SignVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;


/**
 * @Author:SCBC_LiYongJie
 * @time:2021/11/15
 */
@Component
public class SignFilter implements Filter {

    private final static Logger log = LoggerFactory.getLogger(SignFilter.class);

    @Resource
    private ObjectMapper objectMapper;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        SignVo signVo = objectMapper.readValue(httpServletRequest.getInputStream(), SignVo.class);
        if (Objects.isNull(signVo)){
            throw new BaseException("提交的注册表单信息不完整或格式有误");
        }
        log.info("[SignFilter ----- ]{}", signVo);
        chain.doFilter(request,response);
    }
}
