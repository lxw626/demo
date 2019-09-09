package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class MyTestController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostMapping("/test1")
    public String test1(String text){
        String sql = "insert into test (text) values (?)";
        jdbcTemplate.update(sql,text);
        sql = "select * from test where id = (select max(id) from test)";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql);
        String result = map.get("text").toString();
        System.out.println(result);
        return result;
    }
}
