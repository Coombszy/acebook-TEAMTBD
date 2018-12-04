package com.makersacademy.acebook.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HomeController {

//	@RequestMapping(value = "/")
//	public String index() {
//		return "test.html";
//	}

	@RequestMapping(value = "/test")
	public String test() {return "test.html";}

}
