package com.datang.baobei.dao;

import java.util.List;

import com.datang.baobei.entities.Group;
/**
 * 小组DAO接口
 * @author Administrator
 *
 */
public interface GroupDao {
	/**增加小组**/
	public void add(Group group);
	/**删除小组**/
	public void delete(int groupid);
	/**更新小组**/
	public void update(Group group);
	/**查询所有小组**/
	public List<Group> findAll();
	/**根据属性查找小组**/
	public List<Group> findByProperty(String key,Object value);
	
}
