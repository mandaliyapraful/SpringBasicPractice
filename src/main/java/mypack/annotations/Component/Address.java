/**
 * 
 */
package mypack.annotations.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Mandaliya
 *
 */
@Component
public class Address {
	@Value("Surat")
	private String city;
	@Value("5099882")
	private int pincode;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param city
	 * @param pincode
	 */
	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
