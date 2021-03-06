package com.datang.baobei.dao;

import java.util.List;

import com.datang.baobei.entities.Port;

/**
 * 对端口的操作
 * @author Administrator
 *
 */
public interface PortDao {
	/**增加端口**/
	public void add(Port port);
	/**删除端口**/
	public void delete(int portid);
	/**更新端口**/
	public void update(Port port);
	/**根据属性查询**/
	public List<Port> findByProperty(String key,Object value);
	/**查找所有端口**/
	public List<Port>  findAll();
}
