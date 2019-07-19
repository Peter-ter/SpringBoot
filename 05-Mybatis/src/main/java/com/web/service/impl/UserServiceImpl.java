package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.bean.User;
import com.web.dao.UserMapper;
import com.web.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserMapper userDao;
	
	@Transactional
	@Override
	public List<User> findAll() {
		return this.userDao.findAll();
	}
	
	@Transactional
	@Override
	public int delect(int id) {
		return this.userDao.delect(id);
	}
	
	@Transactional
	@Override
	public User find(int id) {
		return this.userDao.select(id);
	}
	
	@Transactional
	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public int addUser(User user) {
		return this.userDao.addUser(user);
	}

}
