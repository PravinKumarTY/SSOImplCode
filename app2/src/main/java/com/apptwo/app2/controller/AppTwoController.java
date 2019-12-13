package com.apptwo.app2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app2")
public class AppTwoController {
	@GetMapping("/app2Print")
	public String appTowPrintMessge() {
		return "this is print message of app two print message.";
	}

}
