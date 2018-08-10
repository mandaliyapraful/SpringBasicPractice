package mypack.annotations.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientLogic {

	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("configAnntationAutowireConst.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println("***********Annotation Autowire for contructor***********");
		System.out.println(emp.getEname()+" "+emp.getRole()+" "+emp.getAddress().getCity()+" "+emp.getAddress().getPincode());
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("configAnntationComponent.xml");
		//Employee emp = (Employee) context.getBean("employee"); if @Component is used then bean name is the same as class name
		Employee emp = (Employee) context.getBean("emp");// when @Component("emp") the name of bean is specifie]=
		System.out.println("***********Annotation Autowire for contructor***********");
		System.out.println(emp.getEname()+" "+emp.getRole()+" "+emp.getAddress().getCity()+" "+emp.getAddress().getPincode());
		
		
	}
}
