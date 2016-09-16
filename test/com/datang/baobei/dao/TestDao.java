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
public class TestDao {
	@Autowired
	private UserDao userDao;
	
	@Resource(name="storeDao")
	private StoreDao storeDao;

	@Resource(name="teamDao")
	private TeamDao teamDao;

	@Test
	public void testSave() {
		Store store = new Store();
		store.setName("A区");
		store.setRegion("双流区");
		Set<Team> teams = new HashSet<Team>();
		for (int i = 0; i < 10; i++) {
			Set<User> users = new HashSet<User>();
			for (int j = 0; j < 10; j++) {
				User user = new User();
				user.setName("张三" + j + "号");
				user.setUsername("psuqgyy");
				user.setPassword("psuqgyy1");
				user.setPhone("13000000000");
				user.setPosition("店长");
				user.setQq("12312123123");
				userDao.add(user);
				users.add(user);
				userDao.add(user);
			}
			Team team = new Team();
			team.setName(i + "小组");
			team.setStore(store);
			team.setUser(users);
			teams.add(team);
			teamDao.add(team);
		}
		store.setTeams(teams);
		storeDao.add(store);
		System.out.println("测试添加人员成功");
	}
}
