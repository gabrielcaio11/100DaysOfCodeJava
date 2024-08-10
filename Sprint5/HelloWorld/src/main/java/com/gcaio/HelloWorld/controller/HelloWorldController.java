package com.gcaio.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping	
	public String welcome() {
		return "Hello World usando Spring Boot";
	}

}
