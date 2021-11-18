package com.signserviceprovider.controller;

import com.signserviceprovider.pojo.SignVo;
import com.signserviceprovider.result.Result;
import com.signserviceprovider.service.SignService;
import com.signserviceprovider.validator.annotation.IsMobile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author:SCBC_LiYongJie
 * @time:2021/11/15
 */
@RestController
public class SignController {

    private static final Logger log = LoggerFactory.getLogger(SignController.class);

    @Resource
    private SignService signService;

    @PostMapping("/sharedkitchen/sign")
    public Result<String> sign(@RequestBody @Validated
                                    SignVo signVo){
        log.info("[SignController ---- SignVo]{}",signVo.toString());
        signService.doSign(signVo);
        return Result.signSuccess();
    }

    @RequestMapping("/sharedkitchen/smssendkaptcha/{phoneNumber}")
    public Result<String> smsSendKaptcha(@PathVariable @IsMobile String phoneNumber){
        //send auth code service
        return Result.success("send auth code success");
    }

    @RequestMapping("/test")
    public Result<String> text( @Validated SignVo signVo){
        log.info(signVo.toString());
        return Result.success("ok");
    }
}
