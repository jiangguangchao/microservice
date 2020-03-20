package com.jgc.service;

import com.jgc.dao.DeptDao;
import com.jgc.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author:jgc
 * @create:2020-03-17 16:39
 */

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept get(String deptNo) {
        return deptDao.get(deptNo);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    @Override
    public boolean add(Dept dept) {
        return deptDao.add(dept);
    }
}
