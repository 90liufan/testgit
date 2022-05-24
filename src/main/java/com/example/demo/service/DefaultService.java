package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
public interface DefaultService {
    default void testDefault(){
        System.out.println("this is test");
    }
    public void read();
}
