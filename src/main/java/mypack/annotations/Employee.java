/**
 * 
 */
package mypack.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Mandaliya
 *
 */
public class Employee {
	private String ename;
	private String role;
	//@Autowired property autowiring 
	private Address address;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired //setter injection annotation autowiring
	@Qualifier("homeAddress")
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @param ename
	 * @param role
	 * @param address
	 */
	//@Autowired for construtor autowire
	/*public Employee(String ename, String role, Address address) {
		super();
		this.ename = ename;
		this.role = role;
		this.address = address;
	}*/
	
}
