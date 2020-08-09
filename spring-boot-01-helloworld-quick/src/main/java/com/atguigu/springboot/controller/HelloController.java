package com.atguigu.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json数据）
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {

    /*@Autowired
    CatSpeak catSpeak;*/

    @RequestMapping("/hello")
    public String hello(){
//        catSpeak.speak("oooo");
        System.out.println("kkkkkkkkkkkkkkkk");

        String systemCode = "cat";
        MyInterface catSpeak = BeanContext.getMyBean("cat");
        catSpeak.speak("00000000000");


        systemCode = "dog";
        MyInterface dogSpeak = BeanContext.getMyBean(systemCode);
        dogSpeak.speak("66666666666");

        dogSpeak.speak("444444444444444444");
        dogSpeak.speak("444444444444444444");

        return "hello world quick!";
    }



    // RESTAPI的方式
}
