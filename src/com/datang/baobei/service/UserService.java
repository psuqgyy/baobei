package com.datang.baobei.service;

import java.util.List;

import com.datang.baobei.entities.User;

/**
 * 员工操作服务层
 * @author Administrator
 *
 */
public interface UserService {

	/**增加员工**/
	public void add(User user);
	/**删除员工**/
	public void delete(int userid);
	/**更新员工**/
	public void update(User user);
	/**查询所有员工**/
	public List<User> findAll();
	/**根据属性员工**/
	public List<User> findByProperty(String key,Object value);
}
