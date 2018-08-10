/**
 * 
 */
package mypack.java.config.component.scan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Mandaliya
 *
 */
@Component
public class Address {
	@Value("Mysore")
	private String city;
	@Value("400019")
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
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
