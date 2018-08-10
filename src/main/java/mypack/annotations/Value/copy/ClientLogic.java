package mypack.annotations.Value.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientLogic {

	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("configAnntationAutowireConst.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println("***********Annotation Autowire for contructor***********");
		System.out.println(emp.getEname()+" "+emp.getRole()+" "+emp.getAddress().getCity()+" "+emp.getAddress().getPincode());
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("configAnntationAutowireProperty.xml");
		Employee emp = (Employee) context.getBean("employee1");
		System.out.println("***********Annotation Autowire for contructor***********");
		System.out.println(emp.getEname()+" "+emp.getRole()+" "+emp.getAddress().getCity()+" "+emp.getAddress().getPincode());
		
		
	}
}
