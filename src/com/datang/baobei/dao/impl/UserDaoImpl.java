package com.datang.baobei.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.datang.baobei.dao.UserDao;
import com.datang.baobei.entities.UserInfo;
/**
 * 员工DAO实现类
 * @author Administrator
 *
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<UserInfo> implements UserDao{

	
	@Override
	public void UserAdd(UserInfo user) {
		// TODO Auto-generated method stub
		save(user);
	}

	@Override
	public void UserDel(int userid) {
		// TODO Auto-generated method stub
		delete(userid);
	}

	@Override
	public void UserUpdate(UserInfo user) {
		// TODO Auto-generated method stub
		update(user);
	}

	@Override
	public List<UserInfo> FindAllUser() {
		// TODO Auto-generated method stub
		return FindAllUser();
	}

	@Override
	public List<UserInfo> FindUserByName(String name) {
		// TODO Auto-generated method stub
		return findByProperty("name", name);
	}

}
