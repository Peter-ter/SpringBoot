package com.web.handles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.beans.User;


@Controller
public class DisplayData {

	@RequestMapping("/listUser")
	public String doSome(Model model) {
		
		List<User> list = new ArrayList();
		User user = null;
		for(int i=0; i<10; i++) {
			user = new User();
			user.setId(i+1);
			user.setUserName("张三"  + i);
			user.setAge(20+i);
			list.add(user);
		}
		model.addAttribute("listUser", list);
		return "listUser";
		
	}
}
