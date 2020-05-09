package com.rbac.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangxiao
 * @Title: SecurityApplication
 * @Package
 * @Description: spring security
 * @date 2020/5/812:37
 */
@SpringBootApplication
@RestController
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class,args);
    }

    @RequestMapping("/")
    public String home (){
        return "home";
    }


    @RequestMapping("/hello")
    public String hello (){
        return "hello";
    }
}
