package com.jgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author:jgc
 * @create:2020-03-17 16:46
 */
@MapperScan("com.jgc.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class Main_Provider_dept_8001 {
    public static void main(String[] args) {
        SpringApplication.run(Main_Provider_dept_8001.class,args);
    }

}
