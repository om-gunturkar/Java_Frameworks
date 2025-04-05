package task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentMain {
	
	public static void main(String[] args) {
		ApplicationContext cont= new ClassPathXmlApplicationContext("Spring2.xml");
		
		task1.student student = (student) cont.getBean("student");
		
		student.display();
	}
}
