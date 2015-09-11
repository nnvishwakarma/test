package poc.rest.ws.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PUBLISHERS")
public class Publisher {
	@Id	
	private Long publisherId;
	private String name;	
	@OneToOne	
	private Address address;
	@OneToOne
	private Contact contact;
	
	public Publisher(){}
	
	public Publisher(Long publisherId,String name,Address address,Contact contact){
		this.publisherId = publisherId;
		this.name = name;
		this.address = address;		
		this.contact = contact;
	}

	public Long getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String toString(){
		return String.format("Publisher: [ %s ]",getName());
	}	
}
