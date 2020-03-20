package com.jgc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author:jgc
 * @create:2020-03-17 20:38
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7001 {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer_7001.class, args);
    }
}
