package com.datang.baobei.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.datang.baobei.dao.PortDao;
import com.datang.baobei.entities.Port;
@Repository("portDao")
public class PortDaoImpl extends BaseDaoImpl<Port> implements PortDao{

	@Override
	public void portSave(Port port) {
		// TODO Auto-generated method stub
		save(port);
	}

	@Override
	public void portDel(int portid) {
		// TODO Auto-generated method stub
		delete(portid);
	}

	@Override
	public void portUpdate(Port port) {
		// TODO Auto-generated method stub
		update(port);
	}

	@Override
	public List<Port> findPortByNumber(String name) {
		// TODO Auto-generated method stub
		return findByProperty("name", name);
	}

	@Override
	public List<Port> findAllPorts() {
		// TODO Auto-generated method stub
		return findAll();
	}

}
