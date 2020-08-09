package com.atguigu.springboot.controller;


import org.springframework.stereotype.Service;

/**
 *
 * @author zhouwj@20190227
 */
@Service
public class CatSpeak implements MyInterface {


    @Override
    public void speak(String str) {
        System.out.println("Cat CatSpeak .........." + str);
    }
}

