package com.goott.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

//	git test_이동현.
	@RequestMapping("/test")
	public String testJieun() {
		return "test";
	}
	
	@RequestMapping("/test2")
	public String testJieun2() {
		return "test";
	}

	@RequestMapping("/test3")
	public String testJieun3() {
		return "test";
	}

	@RequestMapping("/test4")
	public String testyujung() {
		return "test";
	}
	
	@RequestMapping("/test99")
	public String testyujung2() {
		return "test";
	}
}
