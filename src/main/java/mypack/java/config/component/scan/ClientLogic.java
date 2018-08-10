/**
 * 
 */
package mypack.java.config.component.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Mandaliya
 *
 */
public class ClientLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		CourseReg courseReg = (CourseReg) context.getBean("courseReg");
		System.out.println(courseReg);
	}

}
