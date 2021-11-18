package com.signserviceprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.signserviceprovider.dao")
public class SignServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SignServiceProviderApplication.class, args);
    }
}
