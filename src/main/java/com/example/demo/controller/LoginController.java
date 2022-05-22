package com.example.demo.controller;

import com.example.demo.service.DefaultService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/get")
@Slf4j
public class LoginController {

    @Autowired
    private DefaultService defaultService;
    @GetMapping(value="mytest")
    public String getRequest(@RequestParam String name){
        log.info("这是第一个测试"+name);
        log.info("这是第二个测试"+name);
        return name;

    }
    @GetMapping(value="lambda")
    public String testLambda(){
        defaultService.testDefault();
        return "success";
    }

}
