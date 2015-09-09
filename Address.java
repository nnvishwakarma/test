package poc.rest.ws.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESSES")
public class Address {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long addressId;
	private String addLine;
	private String city;
	private String region;
	private String country;
	private String zipCode;
	
	public Address(){
		this.addressId=0L;
	}
	
	public Address(Long addressId, String addLine, String city, String region, String country, String zipCode){
		this.addressId=addressId;
		this.addLine=addLine;
		this.city=city;
		this.region = region;
		this.country = country;
		this.zipCode = zipCode;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getAddLine() {
		return addLine;
	}
	public void setAddLine(String addLine) {
		this.addLine = addLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String toString(){
		return String.format("Address:[%s, %s, %s, %s, %s]",
				getAddLine(),getCity(),getRegion(),getCountry(),getZipCode());
	}
	
	
}
