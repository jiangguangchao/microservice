package com.jgc.dao;

import com.jgc.domain.Dept;

import java.util.List;

public interface DeptDao {
    public Dept get(String deptNo);

    public List<Dept> findAll();

    public boolean add(Dept dept);
}
