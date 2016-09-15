package com.datang.baobei.service;

import java.util.List;

import com.datang.baobei.entities.Group;
import com.datang.baobei.entities.Port;

/**
 * 端口操作服务层
 * @author Administrator
 *
 */
public interface PortService {

	/**增加端口**/
	public void add(Port port);
	/**删除端口**/
	public void delete(int portid);
	/**更新端口**/
	public void update(Port port);
	/**查询所有端口**/
	public List<Port> findAll();
	/**根据属性端口**/
	public List<Port> findByProperty(String key,Object value);
}
