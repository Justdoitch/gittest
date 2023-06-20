package com.goott.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StstestController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/sts/test/kim")
	public void name() {
		
	}
}
