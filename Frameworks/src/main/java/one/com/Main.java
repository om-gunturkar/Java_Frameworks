package one.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("Starting the code");
		ApplicationContext fac=new ClassPathXmlApplicationContext("spring1.xml");
		traingle obj=(traingle) fac.getBean("tr");
		obj.Draw();
		System.out.println("Code Ends !!!");
	}
}
