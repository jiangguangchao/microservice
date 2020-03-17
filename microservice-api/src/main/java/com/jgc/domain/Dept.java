package com.jgc.domain;

import java.io.Serializable;

/**
 * @description:
 * @author:jgc
 * @create:2020-03-17 16:28
 */
public class Dept implements Serializable {

    private Integer deptNo;
    private String dName;
    private String dbSource;

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", dName='" + dName + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
