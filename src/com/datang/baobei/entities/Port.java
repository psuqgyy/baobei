package com.datang.baobei.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 端口(58,赶集，安居客)
 * @author Administrator
 *
 */
@Entity
@Table(name="port")
public class Port {

	/**ID**/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	/**端口号**/
	private String number;
	/**端口类型(58,赶集，安居客)**/
	private String type;
	/**开始时间**/
	private Date beginTime;
	/**结束时间**/
	private Date endTime;
	/**价格**/
	private float price;
	/**端口对应手机号**/
	private String iphone;
	/**员工**/
	@ManyToOne
	@JoinColumn(name = "user_id")  
	private User user;
	@OneToMany
	@JoinColumn(name = "port_id")  
	private Set<Fangyuan> fangyuans = new HashSet<Fangyuan>();
	
	public String getIphone() {
		return iphone;
	}
	public void setIphone(String iphone) {
		this.iphone = iphone;
	}
	public Set<Fangyuan> getFangyuans() {
		return fangyuans;
	}
	public void setFangyuans(Set<Fangyuan> fangyuans) {
		this.fangyuans = fangyuans;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
