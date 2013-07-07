package com.qooyee.web.entities;

import static org.junit.Assert.*;

import java.util.Date;

import junit.framework.Assert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qooyee.web.db.HibernateUtils;

public class ProjectTest {

	private Session session;
	
	private Project entity;
	
	@Before
	public void setUp() throws Exception {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		session = sf.openSession();
		
		entity = new Project();
		entity.setTitle("Project1");
		entity.setIntro("Project Introduce");
		entity.setCreateTime(new Date());
		entity.setCreateUser(1);
	}

	@After
	public void tearDown() throws Exception {
		session.close();
	}

	@Test
	public void testInsert() {
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
		
		Project p = (Project) session.get(Project.class, 1);
		Assert.assertEquals(p.getPid(), entity.getPid());
	}

}
