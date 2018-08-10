/**
 * 
 */
package mypack.java.config.component.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Mandaliya
 *
 */
@Component
public class CourseReg {
	@Autowired
	private Student stud;
	@Value("Maths")
	private String cname;
	@Value("101")
	private String ccode;
	/**
	 * @return the stud
	 */
	public Student getStud() {
		return stud;
	}
	/**
	 * @param stud the stud to set
	 */
	public void setStud(Student stud) {
		this.stud = stud;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the ccode
	 */
	public String getCcode() {
		return ccode;
	}
	/**
	 * @param ccode the ccode to set
	 */
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ConfigReg [stud=" + stud + ", cname=" + cname + ", ccode=" + ccode + "]";
	}
	
	
}
