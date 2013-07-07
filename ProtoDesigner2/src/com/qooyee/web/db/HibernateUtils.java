package com.qooyee.web.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class HibernateUtils {
	
	private static final Logger log = LoggerFactory.getLogger(HibernateUtils.class);
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		SessionFactory sessionFactory = null;
		try{
			Configuration config = new Configuration();
			config.configure();
			ServiceRegistry sr = new ServiceRegistryBuilder()
			.applySettings(config.getProperties())
			.buildServiceRegistry();
			
			sessionFactory = config.buildSessionFactory(sr);
		}catch(Throwable ex){
			log.error("func[buildSessionFactory] " + ex.getMessage(), ex);
		}
		return sessionFactory;
	}
	
	public synchronized static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
