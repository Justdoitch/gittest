package com.goott.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class KimTestController {
    
    @RequestMapping(value="/test/kim", method=RequestMethod.GET)
    public String requestMethodName(@RequestParam String param) {
        return "/test/kim";
    }


    
    //test branch 이건 feature에서 생산된 주석

}
