package com.example.demo.controller;


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

    @GetMapping(value="mytest")
    public String getRequest(@RequestParam String name){
        log.info("这是第一个测试"+name);
        return name;
    }

    @GetMapping(value="lambda")
    public String testLambda(@RequestParam String name){
        Java8Tester tester = new Java8Tester();

        // 类型声明
        com.example.demo.controller.MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        com.example.demo.controller.MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        com.example.demo.controller.MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        com.example.demo.controller.MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        com.example.demo.controller.GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        com.example.demo.controller.GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
        return name;
    }

    public String testaaa(){
        return "sucdess";
    }
    public String testccc(){
        return "sucdess";
    }

    public String testbbb(){
        return "sucdess";
    }


}
