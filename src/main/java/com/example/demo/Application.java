package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fangxiaosi
 * @desc
 * @date 09-15 10:55
 */
public class Application {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}
