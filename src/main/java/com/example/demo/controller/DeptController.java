package com.example.demo.controller;

import com.example.demo.core.base.entity.Response;
import com.example.demo.entity.Dept;
import com.example.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @autor lixiewen
 * @date 2018/12/25-13:49
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @PostMapping("/addDept")
    public Response addDept(Dept dept) {
        Integer result = deptService.insert(dept);
        return new Response().success(result);
    }
    @DeleteMapping("/deleteByPrimaryKey")
    public Response deleteByPrimaryKey(Integer deptno) {
        Integer result = deptService.deleteByPrimaryKey(deptno);
        return new Response().success(result);
    }
    @DeleteMapping("/deleteByEntity")
    public Response deleteByEntity(Dept dept) {
        Integer result = deptService.deleteByEntity(dept);
        return new Response().success(result);
    }
    @PutMapping("/updateByPrimaryKey")
    public Response updateByPrimaryKey(Dept dept) {
        Integer result = deptService.updateByPrimaryKey(dept);
        return new Response().success(result);
    }
    @GetMapping("/findAll")
    public Response findAll() {
        List<Dept> result = deptService.findAll();
        return new Response().success(result);
    }
    @GetMapping("/findByPrimaryKey")
    public Response findByPrimaryKey(Integer deptno) {
        Dept result = deptService.findByPrimaryKey(deptno);
        return new Response().success(result);
    }
    @GetMapping("/findByEntity")
    public Response findByEntity(Dept dept) {
        List<Dept> result = deptService.findByEntity(dept);
        return new Response().success(result);
    }
}
