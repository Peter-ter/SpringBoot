package com.web.service;

import java.util.List;

import com.web.bean.User;

public interface UserService {

	List<User> findAll();

	int delect(int id);

	User find(int id);

	void update(User user);

	int addUser(User user);

}
