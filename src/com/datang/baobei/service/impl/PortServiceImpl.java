package com.datang.baobei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datang.baobei.dao.PortDao;
import com.datang.baobei.entities.Port;
import com.datang.baobei.service.PortService;
/**
 * 端口服务层
 * @author Administrator
 *
 */
@Service("portServer")
public class PortServiceImpl implements PortService{

	@Resource(name="portDao")
	private PortDao portDao;
	@Override
	public void add(Port port) {
		// TODO Auto-generated method stub
		portDao.add(port);
	}

	@Override
	public void delete(int portid) {
		// TODO Auto-generated method stub
		portDao.delete(portid);
	}

	@Override
	public void update(Port port) {
		// TODO Auto-generated method stub
		portDao.update(port);
	}

	@Override
	public List<Port> findAll() {
		// TODO Auto-generated method stub
		return portDao.findAll();
	}

	@Override
	public List<Port> findByProperty(String key, Object value) {
		// TODO Auto-generated method stub
		return portDao.findByProperty(key, value);
	}

}
