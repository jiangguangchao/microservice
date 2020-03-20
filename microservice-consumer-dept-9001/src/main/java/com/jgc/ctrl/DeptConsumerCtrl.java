package com.jgc.ctrl;

import com.jgc.domain.Dept;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author:jgc
 * @create:2020-03-17 18:24
 */
@RestController
public class DeptConsumerCtrl {

    //private static final String HTTP_PREFix="http://localhost:8001/";
    private static final String HTTP_PREFix="http://provider-dept/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/dept/get/{dID}")
    public Dept get(@PathVariable("dID") String dID) {
        return restTemplate.getForObject(HTTP_PREFix + "provider/dept/get/" + dID, Dept.class);
    }
}
