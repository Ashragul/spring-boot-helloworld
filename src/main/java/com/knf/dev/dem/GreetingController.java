package com.knf.dev.dem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Ashraf! Your application is running. Keep learning new skills";
	}

}
