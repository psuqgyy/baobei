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
	public void testFindAll(){
		userDao.findAll();
	}
	@Test
	public void testSave(){
		User user=new User();
		user.setName("张三");
		user.setUsername("psuqgyy");
		user.setPassword("psuqgyy1");
		user.setPhone("123123123123");
		user.setPosition("店长");
		user.setQq("12312123123");
		userDao.add(user);
		System.out.println("测试添加人员成功");
	}
//	@Test
//	public void testSave10(){
//		for(int i=0;i<9;i++){
//			testSave();
//		}
//	}
}

