package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Emp implements Serializable {
    private Short empno;

    private String ename;

    private String job;

    private Short mgr;

    private Date hiredate;

    private Double sal;

    private BigDecimal comm;

    private Short deptno;


}