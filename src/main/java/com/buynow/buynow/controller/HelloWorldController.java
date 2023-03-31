package com.buynow.buynow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/home")
	public String hello() {
		return "Hello World";
	}
}
