package com.datang.baobei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datang.baobei.dao.StoreDao;
import com.datang.baobei.entities.Store;
import com.datang.baobei.service.StoreService;
@Service("storeService")
public class StoreServiceImpl implements StoreService{

	@Resource(name="storeDao")
	private StoreDao storeDao;
	@Override
	public void add(Store store) {
		// TODO Auto-generated method stub
		storeDao.add(store);
	}

	@Override
	public void delete(int storeid) {
		// TODO Auto-generated method stub
		storeDao.delete(storeid);
	}

	@Override
	public void update(Store store) {
		// TODO Auto-generated method stub
		storeDao.update(store);
	}

	@Override
	public List<Store> findAll() {
		// TODO Auto-generated method stub
		return storeDao.findAll();
	}

	@Override
	public List<Store> findByProperty(String key, Object value) {
		// TODO Auto-generated method stub
		return storeDao.findByProperty(key, value);
	}

}
