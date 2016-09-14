package com.datang.baobei.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 员工店铺
 * @author Administrator
 *
 */
@Entity
@Table(name="store")
public class Store {

	/**ID*/
	@Id
	@Column(name="id") 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	/**店铺名字*/
	private String name;
	/**密码*/
	private String password;
	/**店铺区域*/
	private String region;
	@OneToMany(mappedBy="store",cascade=CascadeType.ALL,fetch=FetchType.LAZY) 
	private Set<UserInfo> users;
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Set<UserInfo> getUsers() {
		return users;
	}
	public void setUsers(Set<UserInfo> users) {
		this.users = users;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
