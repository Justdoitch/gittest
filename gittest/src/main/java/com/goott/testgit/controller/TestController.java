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
	
	
	// 임지혁2124
	@RequestMapping("/test4")
	public String testIJH() {
		return "test";
		
	}
	
	@RequestMapping("/test5")
	public String testyujung1() {
		return "test";
	}

}
