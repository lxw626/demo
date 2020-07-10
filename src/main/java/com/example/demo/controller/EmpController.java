package com.example.demo.controller;

import com.example.demo.core.base.entity.Response;
import com.example.demo.entity.Emp;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @autor lixiewen
 * @date 2018/12/25-13:49
 */
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    @PostMapping("/addEmp")
    public Response addEmp(@RequestBody Emp emp) {
        Integer result = empService.insert(emp);
        return new Response().success(result);
    }
    @DeleteMapping("/deleteEmp")
    public Response deleteEmp(@RequestBody Emp emp) {
        Integer result = empService.delete(emp);
        return new Response().success(result);
    }
    @PutMapping("/updateEmp")
    public Response updateEmp(@RequestBody Emp emp) {
        Integer result = empService.update(emp);
        return new Response().success(result);
    }
    @PostMapping("/getEmpByParams")
    public Response getEmpByParams(@RequestBody Emp emp) {
        List<Emp> result = empService.select(emp);
        return new Response().success(result);
    }
    @GetMapping("/getEmpAll")
    public Response getEmpAll() {
        List<Emp> result = empService.selectEmpAll();
        return new Response().success(result);
    }
}
