package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(userName) && "123456".equals(password)){
            System.out.println("userName:"+userName+",password:"+password);
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("userName",userName);
            return "redirect:/main.html";
        }
        //登陆失败
        map.put("msg","用户名密码错误");
        return  "index";

    }
}
