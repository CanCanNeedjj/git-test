package com.spedu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by sanqiu
 * Data 2023/3/9 20:07
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String index(){
        System.out.println("master");
        System.out.println("fixfixfix");
        System.out.println("push test");
        return "你好git,hhhhhhhh,master";
    }
}
