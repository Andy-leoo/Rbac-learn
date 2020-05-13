package com.rbac.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
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
@MapperScan({"com.rbac.learn.dao"})
public class RbacApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbacApplication.class,args);
    }

}
