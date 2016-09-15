package com.datang.baobei.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 员工店铺表
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
	/**店铺区域 */
	private String region;
	@OneToMany
	@JoinColumn(name="store_id")
	private Set<Group> groups;
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
	public Set<Group> getGroups() {
		return groups;
	}
	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	
}
