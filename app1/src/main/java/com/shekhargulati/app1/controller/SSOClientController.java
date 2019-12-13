package com.shekhargulati.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app1")
public class SSOClientController {
	@GetMapping("/hello")
	public String showMessage() {
		return "hello sso client";
	}
	
	@GetMapping("/print")
	public String printMessage() {
		return "This is printMessage method";
	}

}
