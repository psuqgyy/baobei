package com.datang.baobei.service;

import java.util.List;

import com.datang.baobei.entities.Store;

/**
 * 店铺操作服务层
 * @author Administrator
 *
 */
public interface StoreService {

	/**增加店铺**/
	public void add(Store store);
	/**删除店铺**/
	public void delete(int storeid);
	/**更新店铺**/
	public void update(Store store);
	/**查询所有店铺**/
	public List<Store> findAll();
	/**根据属性店铺**/
	public List<Store> findByProperty(String key,Object value);
}
