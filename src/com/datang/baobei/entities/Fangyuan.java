package com.datang.baobei.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 房源信息表
 * @author Administrator
 *
 */
@Entity
@Table(name="fangyuan")
public class Fangyuan {

	/**ID**/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	/**房源发布日期**/
	private Date date;
	/**房源匹配的端口**/
	@ManyToOne
	@JoinColumn(name="port_id")
	private Port port;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Port getProt() {
		return port;
	}
	public void setProt(Port prot) {
		this.port = prot;
	}
	
}
