package poc.rest.ws.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AUTHORS")
public class Author {
	@Id
	private Long authorId;
	private String name;
	@OneToOne
	private Address address;	
	@OneToOne
	private Contact contact;
	private String profile;
	
	public Author(){}
	
	public Author(Long authorId, String name, Address address, String profile){
		this.authorId = authorId;
		this.name = name;
		this.address = address;
		this.profile = profile;
	}
	
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
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
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public String toString(){
		return String.format("Author:[ %s, %s]" ,getName(),getProfile());
	}
	
}
