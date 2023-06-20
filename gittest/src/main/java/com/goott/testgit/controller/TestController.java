package com.goott.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String testJieun() {
		return "test";
	}
	
	@RequestMapping("/test2")
	public String testJieun2() {
		return "test";
	}
}
