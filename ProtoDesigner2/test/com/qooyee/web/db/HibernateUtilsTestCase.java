package com.qooyee.web.db;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

public class HibernateUtilsTestCase {

	@Test
	public void testGetSessionFactory() {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Assert.assertNotNull(sf);
	}

}
