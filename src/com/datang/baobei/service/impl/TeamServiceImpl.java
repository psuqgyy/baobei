package com.datang.baobei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datang.baobei.dao.TeamDao;
import com.datang.baobei.entities.Team;
import com.datang.baobei.service.TeamService;
@Service("teamService")
public class TeamServiceImpl implements TeamService{

	@Resource(name="teamDao")
	private TeamDao teamDao;
	@Override
	public void add(Team team) {
		// TODO Auto-generated method stub
		teamDao.add(team);
	}

	@Override
	public void delete(int teamid) {
		// TODO Auto-generated method stub
		teamDao.delete(teamid);
		
	}

	@Override
	public void update(Team team) {
		// TODO Auto-generated method stub
		teamDao.update(team);
	}

	@Override
	public List<Team> findAll() {
		// TODO Auto-generated method stub
		return teamDao.findAll();
	}

	@Override
	public List<Team> findByProperty(String key, Object value) {
		// TODO Auto-generated method stub
		return teamDao.findByProperty(key, value);
	}

}
