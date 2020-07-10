package com.example.demo.service;

import com.example.demo.entity.Emp;
import com.example.demo.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor lixiewen
 * @date 2018/12/25-13:48
 */
@Service
public class EmpService {
    @Autowired
    private EmpMapper empMapper;

    public Integer insert(Emp emp) {
        return empMapper.insert(emp);
    }

    public Integer delete(Emp emp) {
        return empMapper.delete(emp);
    }

    public Integer update(Emp emp) {
        return empMapper.update(emp);
    }

    public List<Emp> select(Emp emp) {
        return empMapper.selectEmp(emp);
    }

    public List<Emp> selectEmpAll() {
        return empMapper.selectEmpAll();
    }
}
