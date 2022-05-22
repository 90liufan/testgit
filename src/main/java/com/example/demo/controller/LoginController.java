package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/get")
public class LoginController {

    @GetMapping(value="mytest")
    public String getRequest(@RequestParam String name){
        return name;
    }

}
