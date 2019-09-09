package com.example.demo.entity;

import java.io.Serializable;

public class Bonus implements Serializable {
    private String ename;

    private String job;

    private Short sal;

    private Short comm;

    private static final long serialVersionUID = 1L;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Short getSal() {
        return sal;
    }

    public void setSal(Short sal) {
        this.sal = sal;
    }

    public Short getComm() {
        return comm;
    }

    public void setComm(Short comm) {
        this.comm = comm;
    }
}