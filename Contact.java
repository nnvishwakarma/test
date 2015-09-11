package poc.rest.ws.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACTS")
public class Contact {
	@Id
	private Long contactId;
	private String residanceNo;
	private String officeNo;
	private String mailId;
	
	public Contact() {}
	
	public Contact(Long contactId, String residanceNo, String officeNo, String mailId){
		this.contactId = contactId;
		this.residanceNo = residanceNo;
		this.officeNo = officeNo;
		this.mailId = mailId;
	}
	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
	public String getResidanceNo() {
		return residanceNo;
	}
	public void setResidanceNo(String residanceNo) {
		this.residanceNo = residanceNo;
	}
	public String getOfficeNo() {
		return officeNo;
	}
	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	public String toString(){
		return String.format("Contact: [%s, %s, %s]",
				getResidanceNo(),getOfficeNo(),getMailId());
				
	}
	
}
