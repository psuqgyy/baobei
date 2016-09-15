package com.datang.baobei.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.datang.baobei.entities.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
@Transactional
@TransactionConfiguration(defaultRollback=false)
public class TestUserDao {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testSave(){
		User user=new User();
		user.setName("张三");
		user.setPassword("asdfasdfasdf");
		user.setPhone("123123123123");
		user.setPosition("店长");
		user.setQq("12312123123");
		userDao.UserAdd(user);
		System.out.println("asdfasdfsdf");
	}
	
}

