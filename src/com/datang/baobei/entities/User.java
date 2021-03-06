package com.datang.baobei.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * 员工信息
 * @author Administrator
 *
 */
@Entity
@Table(name="user")
@JsonIgnoreProperties(value={"team","ports"})
public class User {
	/**ID*/
	@Id
	@Column(name="id") 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	/**账号-真实名字*/
	private String name;
	/**手机号-登录账号*/
	private String phone;
	/**员工账号*/
	private String username;
	/**密码*/
	private String password;
	/**QQ号*/
	private String qq;
	/**公司职务*/
	private String position;
	/**员工所在店铺*/
	@ManyToOne
	@JoinColumn(name = "team_id")  
	private Team team;
	/**一个员工有多个端口号**/
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name = "user_id")  
	private Set<Port> ports=new HashSet<Port>();;
	
	public Set<Port> getPorts() {
		return ports;
	}
	public void setPorts(Set<Port> ports) {
		this.ports = ports;
	}
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
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Team getteam() {
		return team;
	}
	public void setteam(Team team) {
		this.team = team;
	}
	
}
