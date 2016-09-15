package com.datang.baobei.dao.impl;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;

import com.datang.baobei.dao.StoreDao;
import com.datang.baobei.entities.Store;
@Repository("storeDao")
public class StoreDaoImpl extends BaseDaoImpl<Store> implements StoreDao{

	@Override
	public void add(Store store) {
		// TODO Auto-generated method stub
		super.save(store);
	}

	@Override
	public void delete(int storeid) {
		// TODO Auto-generated method stub
		super.delete(storeid);
	}

	@Override
	public void update(Store store) {
		// TODO Auto-generated method stub
		super.update(store);
	}
	@Override
	public List<Store> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	@Override
	public List<Store> findByProperty(String name, Object value) {
		// TODO Auto-generated method stub
		return super.findByProperty(name, value);
	}
}
