package com.atguigu.springboot.controller;

import org.springframework.stereotype.Component;

/**
 * @author zhouwj@20190227
 */
@Component
public interface MyInterface {
    /**
     * 获取匹配规则的全部用户信息
     * @return
     */
    abstract void speak(String str);
    
}
