package com.jgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description:
 * @author:jgc
 * @create:2020-03-17 19:10
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="provider_dept")
public class Main_Consumer_Dept_9001 {
    public static void main(String[] args) {
        SpringApplication.run(Main_Consumer_Dept_9001.class, args);
    }
}
