package poc.rest.ws.main;

import java.io.IOException;

import org.hibernate.Session;

import poc.rest.ws.beans.User;
import poc.rest.ws.resources.HibernateConfig;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*URI uri = URI.create("http://localhost:8585/ws");
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, new ApplicationConfig());
		server.start();*/
		connect();
	}
	public static void connect(){
		Session session=HibernateConfig.getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User(123L, "Administrator", "admin","admin@corp.com",1);
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
	
}
