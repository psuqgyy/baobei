package com.datang.baobei.dao;

import java.util.List;

import com.datang.baobei.entities.User;
/**
 * 员工DAO借口
 * @author Administrator
 *
 */
public interface UserDao {
	/**增加员工**/
	public void add(User user);
	/**删除员工**/
	public void delete(int userid);
	/**更新员工**/
	public void update(User user);
	/**查询所有员工**/
	public List<User> findAll();
	/**根据属性查找**/
	public List<User> findByProperty(String key,Object value);
	
}
