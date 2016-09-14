package com.datang.baobei;


import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class PortalHibernateTest {

	private ApplicationContext ac = null;
	{
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	/**
	 * 打印connection  生成数据表
	 */
	@Test
	public void testHibernate(){
		
		SessionFactory sf = ac.getBean(SessionFactory.class);
		Session  session = sf.openSession();
		
		session.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				System.out.println(arg0);
			}
		});
	}
	
	/**
	 * 打印connection  生成数据表
	 * @throws SQLException
	 */
	@Test
	public void test() throws SQLException {
		DataSource dataSource = ac.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
		
	}

}
