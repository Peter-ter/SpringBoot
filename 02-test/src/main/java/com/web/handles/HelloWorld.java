package com.web.handles;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping("/hello")
	public String doSome(String name) {
		return "Hello " + name + " World!";
	}
}
