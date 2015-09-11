package poc.rest.ws.main;

import java.io.IOException;

import org.hibernate.Session;

import poc.rest.ws.beans.Address;
import poc.rest.ws.beans.Author;
import poc.rest.ws.beans.Contact;
import poc.rest.ws.beans.User;
import poc.rest.ws.resources.HibernateConfig;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*URI uri = URI.create("http://localhost:8585/ws");
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, new ApplicationConfig());
		server.start();*/
		//connect();
		//saveAddress();
		//saveContact();
		//saveAddress_1();
		//saveContact_1();
		saveAuthors();
		HibernateConfig.shutDown();
	}
	public static void connect(){
		Session session=HibernateConfig.getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User(123L, "Administrator", "admin","admin@corp.com",1);
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
	public static void saveAddress(){
		Address address=new Address(1L,
				"Module G4, Ground Floor, Elnet Software City, TS-140, Block 2 & 9, Rajiv Gandhi Salai, Taramani",				
				"Chennai",
				"Tamil Nadu",
				"India",
				"600113"
				);
		
		Session session=HibernateConfig.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(address);
		session.getTransaction().commit();
		session.close();		
		
	}
	public static void saveAddress_1(){
		Address address=new Address(2L,
				"Module G6, Ground Floor, TRA Software City, TS-140, Block 2 & 9, Rajiv Gandhi Salai, Taronoto",				
				"Bangalore",
				"Karnataka",
				"India",
				"560085"
				);
		
		Session session=HibernateConfig.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(address);
		session.getTransaction().commit();
		session.close();		
		
	}
	public static void saveContact(){
		Contact contact = new Contact(1L,"9857452802","8574859665","test@octacorp.com");
		Session session=HibernateConfig.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(contact);
		session.getTransaction().commit();
		session.close();		
	}
	public static void saveContact_1(){
		Contact contact = new Contact(2L,"9857456468","8574851002","ytray@octacorp.com");
		Session session=HibernateConfig.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(contact);
		session.getTransaction().commit();
		session.close();		
	}
	public static void saveAuthors(){
		Session session=HibernateConfig.getSessionFactory().openSession();
		session.beginTransaction();
		Address address1=(Address)session.load(Address.class, 1L);
		Address address2=(Address)session.load(Address.class, 2L);
		Author author1=new Author(11L, "J Peterson", address1, "This is sample author 1.");
		Author author2=new Author(13L, "J Peterson", address2, "This is sample author 2.");
		session.save(author1);
		session.save(author2);
		session.getTransaction().commit();
		session.close();	
		
	}
	
	
	
	
}
