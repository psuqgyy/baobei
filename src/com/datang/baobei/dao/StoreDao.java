package com.datang.baobei.dao;

import java.util.List;

import com.datang.baobei.entities.Store;

/**
 * 对店铺的操作
 * @author Administrator
 *
 */
public interface StoreDao {
	/**增加店铺**/
	public void add(Store store);
	/**删除店铺**/
	public void delete(int storeid);
	/**更新店铺**/
	public void update(Store store);
	/**根据属性查询店铺**/
	public List<Store> findByProperty(String key,Object value);
	/**查找所有店铺**/
	public List<Store>  findAll();
}
