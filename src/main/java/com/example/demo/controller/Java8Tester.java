package com.example.demo.controller;

import org.springframework.stereotype.Service;

@Service
public class Java8Tester {

    public int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}