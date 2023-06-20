package com.goott.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class KimTest { // 입력
    @RequestMapping(value="get", method=RequestMethod.GET)
    public String kimTestMethod(@RequestParam String param) {
        return "test";
    }
    
}
