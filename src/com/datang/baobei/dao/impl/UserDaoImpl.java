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
	public void add(User user) {
		// TODO Auto-generated method stub
		super.save(user);
	}

	@Override
	public void delete(int userid) {
		// TODO Auto-generated method stub
		super.delete(userid);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		super.update(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public List<User> findByProperty(String key,Object value) {
		// TODO Auto-generated method stub
		return super.findByProperty(key, value);
	}


}
