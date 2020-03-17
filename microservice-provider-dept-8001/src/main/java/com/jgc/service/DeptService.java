package com.jgc.service;

import com.jgc.domain.Dept;

import java.util.List;

public interface DeptService {

    public Dept get(String deptNo);

    public List<Dept> findAll();

    public boolean add(Dept dept);
}
