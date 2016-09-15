package com.datang.baobei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datang.baobei.dao.UserDao;
import com.datang.baobei.entities.User;
import com.datang.baobei.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource(name="userDao")
	private UserDao userDao;
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	@Override
	public void delete(int userid) {
		// TODO Auto-generated method stub
		userDao.delete(userid);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public List<User> findByProperty(String key, Object value) {
		// TODO Auto-generated method stub
		return userDao.findByProperty(key, value);
	}

}
