package com.jgc.ctrl;

import com.jgc.domain.Dept;
import com.jgc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author:jgc
 * @create:2020-03-17 16:41
 */

@RestController
public class DetpCtrl {

    @Autowired
    private DeptService deptService;


    @GetMapping("/provider/dept/get/{deptNo}")
    public Dept get(@PathVariable("deptNo") String deptNo){
        System.out.println("deptNo:" + deptNo);
        return deptService.get(deptNo);

    }

    @GetMapping("/provider/dept/findAll")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

    public boolean add(Dept dept) {
        return deptService.add(dept);
    }
}
