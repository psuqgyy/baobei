package com.datang.baobei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datang.baobei.dao.GroupDao;
import com.datang.baobei.entities.Group;
import com.datang.baobei.service.GroupService;
@Service("groupService")
public class GroupServiceImpl implements GroupService{

	@Resource(name="groupDao")
	private GroupDao groupDao;
	@Override
	public void add(Group group) {
		// TODO Auto-generated method stub
		groupDao.add(group);
	}

	@Override
	public void delete(int groupid) {
		// TODO Auto-generated method stub
		groupDao.delete(groupid);
		
	}

	@Override
	public void update(Group group) {
		// TODO Auto-generated method stub
		groupDao.update(group);
	}

	@Override
	public List<Group> findAll() {
		// TODO Auto-generated method stub
		return groupDao.findAll();
	}

	@Override
	public List<Group> findByProperty(String key, Object value) {
		// TODO Auto-generated method stub
		return groupDao.findByProperty(key, value);
	}

}
