package poc.rest.ws.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Tuplizer;
@Entity
@Table(name="USERS")
public class User {
	@Id	
	private Long userId;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String emailId;
	@Tuplizer(impl=Date.class)
	private Date lastLogin;
	
	private int status;
	
	public User(){}
	
	public User(Long userid,String name,String password,String emailId,int status){
		this.userId=userid;
		this.name=name;
		this.password=password;
		this.emailId=emailId;
		this.status=status;
		this.lastLogin=new Date(System.currentTimeMillis());		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
