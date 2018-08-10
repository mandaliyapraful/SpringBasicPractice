package mypack.annotations.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientLogic {

	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("configAnntationAutowireConst.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println("***********Annotation Autowire for contructor***********");
		System.out.println(emp.getEname()+" "+emp.getRole()+" "+emp.getAddress().getCity()+" "+emp.getAddress().getPincode());
		*/
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("configAnntationAutowireProperty.xml");
		Employee emp = (Employee) context.getBean("employee1");
		System.out.println("***********Annotation Autowire for contructor***********");
		System.out.println(emp.getEname()+" "+emp.getRole()+" "+emp.getAddress().getCity()+" "+emp.getAddress().getPincode());
		*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Employee emp = (Employee) context.getBean("employee");
		emp.getAddress().setCity("Delhi");
		System.out.println("Pune--->Delhi--->Singleton");
		emp.setEname("Sumit");
		System.out.println("***********Java based config***********");
		System.out.println(emp.getEname()+" "+emp.getRole()+" "+emp.getAddress().getCity()+" "+emp.getAddress().getPincode());
		Employee emp1 = (Employee) context.getBean("employee");
		System.out.println("********Scope*************");
		System.out.println(emp1.getEname()+" "+emp1.getRole()+" "+emp1.getAddress().getCity()+" "+emp1.getAddress().getPincode());
		System.out.println("Mahak--->Sumit----prototype");
	}
}
