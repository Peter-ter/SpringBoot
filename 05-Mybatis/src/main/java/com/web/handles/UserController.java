package com.web.handles;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.User;
import com.web.service.UserService;



@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/listUser")
	public String doSome(Model model) {
		List<User> listUser = userService.findAll();
		model.addAttribute("listUser", listUser);
		return "listUser";
		
	}
	
	@RequestMapping("/toUpdate")
	public String  update(HttpServletRequest request,Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		User user = userService.find(id);
		model.addAttribute("user", user);
		return "update";
	}
	
	@RequestMapping("/delectById")
	public String delect(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		id = userService.delect(id);
		return "redirect:/listUser";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		User user = new User();
		user.setId(id);
		user.setUserName(name);
		user.setAge(age);
		user.setPassword(password);
		userService.update(user);
		return "redirect:/listUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("userName");
		int age= Integer.parseInt(request.getParameter("age"));
		String password = request.getParameter("password");
		User user = new User();
		user.setUserName(userName);
		user.setAge(age);
		user.setPassword(password);
		int id = userService.addUser(user);
		return "redirect:/listUser";
	}
	

	@RequestMapping("/toAdd")
	public String  toAdd(HttpServletRequest request) {
		return "addUser";
	}
	
}
