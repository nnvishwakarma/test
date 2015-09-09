package poc.rest.ws.resources;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	private static final SessionFactory sessionFactory = buildFactory();

	private static SessionFactory buildFactory() {
		Configuration cfg=new Configuration().configure();
		return cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
}
