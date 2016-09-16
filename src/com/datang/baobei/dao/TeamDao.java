package com.datang.baobei.dao;

import java.util.List;

import com.datang.baobei.entities.Team;
/**
 * 小组DAO接口
 * @author Administrator
 *
 */
public interface TeamDao {
	/**增加小组**/
	public void add(Team team);
	/**删除小组**/
	public void delete(int teamid);
	/**更新小组**/
	public void update(Team team);
	/**查询所有小组**/
	public List<Team> findAll();
	/**根据属性查找小组**/
	public List<Team> findByProperty(String key,Object value);
	
}
