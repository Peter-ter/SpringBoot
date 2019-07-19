package com.web.handles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.beans.User;


@RestController
public class DisplayData {
	
	@Autowired
	private User user;

	@RequestMapping("/hello")
	public String doSome() {
		return user.toString();
	}
}
