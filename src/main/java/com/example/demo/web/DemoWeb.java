package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// 标记为：restful
public class DemoWeb {

    @RequestMapping("/")
    public String hello(){
        return"Hello world—WEB!";
    }

}
