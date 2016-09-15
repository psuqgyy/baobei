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
	public void portSave(Port port);
	/**删除端口**/
	public void portDel(int portid);
	/**更新端口**/
	public void portUpdate(Port port);
	/**根据端口号查询**/
	public List<Port> findPortByNumber(String name);
	/**查找所有端口**/
	public List<Port>  findAllPorts();
}
