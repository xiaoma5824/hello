package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HelloController {
	
	@Value("${agan.msg}")
	private String msg;
	
	@RequestMapping("/test")
	public String home() {
		return this.msg;
	}
}
