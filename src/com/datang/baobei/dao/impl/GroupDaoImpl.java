package com.datang.baobei.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.datang.baobei.dao.GroupDao;
import com.datang.baobei.entities.Group;
@Repository("groupDao")
public class GroupDaoImpl extends BaseDaoImpl<Group> implements GroupDao{
	
	@Override
	public void add(Group group) {
		// TODO Auto-generated method stub
		super.save(group);
	}

	@Override
	public void delete(int groupid) {
		// TODO Auto-generated method stub
		super.delete(groupid);
	}

	@Override
	public void update(Group group) {
		// TODO Auto-generated method stub
		super.update(group);
	}
	@Override
	public List<Group> findByProperty(String name, Object value) {
		// TODO Auto-generated method stub
		return super.findByProperty(name, value);
	}
	
	@Override
	public List<Group> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

}
