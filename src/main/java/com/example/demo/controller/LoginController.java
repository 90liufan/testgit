package com.example.demo.controller;

import com.example.demo.moudle.Person;
import com.example.demo.service.DefaultService;
import com.example.demo.service.MyLambdaInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    @GetMapping(value="/lambda")
    public String testLambda(@RequestParam String name){
        defaultService.testDefault();
        MyLambdaInterface inter=s -> System.out.println("aaa");
        List<Person> listone=new ArrayList<>();

        List<Person> list=Arrays.asList(
                new Person("张三","风"),
        new Person("李四","狂")
        );
        listone.stream().filter(person -> person.getLastName().startsWith("风")).forEach(person -> System.out.println(person.getName()));
        return "success";
    }



}
