package com.makersacademy.acebook.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@RestController
public class HomeController {

	@RequestMapping(value = "/ree")
	public String index() {
		return "index";
	}

}
