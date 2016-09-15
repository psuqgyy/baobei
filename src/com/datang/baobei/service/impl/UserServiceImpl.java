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
	public void UserAdd(User user) {
		// TODO Auto-generated method stub
		userDao.UserAdd(user);
	}

	@Override
	public void UserDel(int userid) {
		// TODO Auto-generated method stub
		userDao.UserDel(userid);
	}

	@Override
	public void UserUpdate(User user) {
		// TODO Auto-generated method stub
		userDao.UserUpdate(user);
	}

	@Override
	public List<User> FindAllUser() {
		// TODO Auto-generated method stub
		return userDao.FindAllUser();
	}

	@Override
	public List<User> FindUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.FindUserByName(name);
	}

}
