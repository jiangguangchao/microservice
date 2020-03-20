package com.jgc.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author:jgc
 * @create:2020-03-17 19:08
 */
@Configuration
public class DeptConsumerConfig {

    @Bean
    @LoadBalanced//注意，如果是通过eureka访问服务提供者，则必须加@LoadBalanced注解，不论是只有一个服务提供者还是多个，否则会报UnknownHostException
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule()
    {
        //return new RoundRobinRule();
        //return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
        return new RetryRule();
    }
}
