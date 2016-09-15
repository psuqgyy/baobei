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
	public void UserAdd(User user);
	/**删除员工**/
	public void UserDel(int userid);
	/**更新员工**/
	public void UserUpdate(User user);
	/**查询所有员工**/
	public List<User> FindAllUser();
	/**根据名字查找员工**/
	public List<User> FindUserByName(String name);
}
