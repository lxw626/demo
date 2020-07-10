package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class ThymeleafController {

    @RequestMapping("hello")
    public String hello(Map map){
        map.put("msg","hello");
        map.put("xxx","<h2>hello:小新新</h2>");
        return "hello";
    }
    @RequestMapping("show")
    public String show(Map map){
        map.put("uid","123456789");
        map.put("name","Jerry");
        map.put("users", Arrays.asList("张三","李四","王五"));
        return "show";
    }
}
