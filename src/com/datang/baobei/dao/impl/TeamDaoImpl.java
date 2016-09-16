package com.datang.baobei.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.datang.baobei.dao.TeamDao;
import com.datang.baobei.entities.Team;
@Repository("teamDao")
public class TeamDaoImpl extends BaseDaoImpl<Team> implements TeamDao{
	
	@Override
	public void add(Team team) {
		// TODO Auto-generated method stub
		super.save(team);
	}

	@Override
	public void delete(int teamid) {
		// TODO Auto-generated method stub
		super.delete(teamid);
	}

	@Override
	public void update(Team team) {
		// TODO Auto-generated method stub
		super.update(team);
	}
	@Override
	public List<Team> findByProperty(String name, Object value) {
		// TODO Auto-generated method stub
		return super.findByProperty(name, value);
	}
	
	@Override
	public List<Team> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

}
