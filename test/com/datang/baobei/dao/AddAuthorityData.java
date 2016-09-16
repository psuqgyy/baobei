package com.datang.baobei.dao;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.datang.baobei.entities.Team;
import com.datang.baobei.entities.Store;
import com.datang.baobei.entities.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class AddAuthorityData {
	@Autowired
	private UserDao userDao;
	
	@Resource(name="storeDao")
	private StoreDao storeDao;

	@Resource(name="teamDao")
	private TeamDao teamDao;

	@Test
	public void testSave() {
		
		System.out.println("权限测试数据添加成功");
	}
}
