package com.web.handle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/hello")
	public String Hello(String name) {
		return "Hello " + name + " test1";
	}
}

