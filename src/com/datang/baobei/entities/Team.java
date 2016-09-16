package com.datang.baobei.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 店铺下面的组
 * @author Administrator
 *
 */
@Entity
@Table(name="team")
public class Team {

	/**ID**/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	/**小组名字**/
	private String name;
	/**小组所有的员工**/
	@OneToMany
	@JoinColumn(name="team_id")
	private Set<User> users =new HashSet<User>();
	/**小组所在的店铺**/
	@ManyToOne
	@JoinColumn(name = "store_id")  
	private Store store;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<User> getUser() {
		return users;
	}
	public void setUser(Set<User> user) {
		this.users = user;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}

	
}
