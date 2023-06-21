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

	@RequestMapping("/test5")
	public String testyujunggggg() {
		return "test";
	}
	
	@RequestMapping("/test5")
	public String testyujungdddgggg() {
		return "test";
	}
	
	@RequestMapping("/test5")
	public String testyujungdddddgggg() {
		return "test";
	}
//
	@RequestMapping("/test6")
	public String testyujungdddddgggdg() {
		return "test";
	}
	@RequestMapping("/test6")
	public String testy6() {
		return "test";
	}
	
	// 김가현 test
	@RequestMapping("/test7")
	public String testgahyeon() {
		return "test";
	}
	
	// 김가현 test
	@RequestMapping("/test8")
	public String testgahyeon2() {
		return "test";
	}
}
