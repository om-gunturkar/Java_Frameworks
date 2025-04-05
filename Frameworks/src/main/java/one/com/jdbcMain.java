package one.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcMain {
	public static void main(String Args[]) {
	System.out.println("Exec starts");
	ApplicationContext fac=new ClassPathXmlApplicationContext("springJdbc.xml");
	jdbcFunc obj=(jdbcFunc) fac.getBean("id3");
	obj.createTable();
	System.out.println("Done Database created");
	}
}
