package com.datang.baobei.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.datang.baobei.dao.UserDao;
import com.datang.baobei.entities.User;
/**
 * 员工DAO实现类
 * @author Administrator
 *
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	
	@Override
	public void UserAdd(User user) {
		// TODO Auto-generated method stub
		save(user);
	}

	@Override
	public void UserDel(int userid) {
		// TODO Auto-generated method stub
		delete(userid);
	}

	@Override
	public void UserUpdate(User user) {
		// TODO Auto-generated method stub
		update(user);
	}

	@Override
	public List<User> FindAllUser() {
		// TODO Auto-generated method stub
		return findAll();
	}

	@Override
	public List<User> FindUserByName(String name) {
		// TODO Auto-generated method stub
		return findByProperty("name", name);
	}

}
