package com.atguigu.springboot.controller;


import org.springframework.stereotype.Service;

/**
 *
 * @author zhouwj@20190227
 */
@Service
public class DogSpeak implements MyInterface {


    @Override
    public void speak(String str) {
        System.out.println("Dog DogSpeak .........." + str);
    }
}

