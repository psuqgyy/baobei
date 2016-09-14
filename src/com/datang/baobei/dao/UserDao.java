package com.datang.baobei.dao;

import java.util.List;

import com.datang.baobei.entities.UserInfo;
/**
 * 员工DAO借口
 * @author Administrator
 *
 */
public interface UserDao {
	/**增加员工**/
	public void UserAdd(UserInfo user);
	/**删除员工**/
	public void UserDel(int userid);
	/**更新员工**/
	public void UserUpdate(UserInfo user);
	/**查询所有员工**/
	public List<UserInfo> FindAllUser();
	/**根据名字查找员工**/
	public List<UserInfo> FindUserByName(String name);
	
}
