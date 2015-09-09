package poc.rest.ws.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import poc.rest.ws.beans.User;

public class DaoUser {
	private SessionFactory sessionFactory;
	
	public DaoUser(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public void save(User user){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();		
		session.close();
	}
	
	public User findUser(Long userId){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user=(User)session.load(User.class,userId);
		session.getTransaction().commit();
		session.close();
		return user;
	}
	
}
