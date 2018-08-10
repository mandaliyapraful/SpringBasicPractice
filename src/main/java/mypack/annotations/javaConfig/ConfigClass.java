/**
 * 
 */
package mypack.annotations.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Mandaliya
 *
 */
@Configuration
public class ConfigClass {
	@Bean
	@Scope("singleton")
	Address address(){
		Address address = new Address("Bangalore",560082);
		return address;
	}
	@Bean
	@Scope("prototype")
	Employee employee (){
		Employee emp = new Employee();
		emp.setEname("mahak");
		emp.setRole("ETL");
		emp.setAddress(address());
		return emp;
	}
}
