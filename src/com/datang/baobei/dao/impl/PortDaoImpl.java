package com.datang.baobei.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.datang.baobei.dao.PortDao;
import com.datang.baobei.entities.Port;
@Repository("portDao")
public class PortDaoImpl extends BaseDaoImpl<Port> implements PortDao{

	@Override
	public void add(Port port) {
		// TODO Auto-generated method stub
		super.save(port);
	}

	@Override
	public void delete(int portid) {
		// TODO Auto-generated method stub
		super.delete(portid);
	}

	@Override
	public void update(Port port) {
		// TODO Auto-generated method stub
		super.update(port);
	}

	@Override
	public List<Port> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	@Override
	public List<Port> findByProperty(String name, Object value) {
		// TODO Auto-generated method stub
		return super.findByProperty(name, value);
	}
}
