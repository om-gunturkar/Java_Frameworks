package one.com;

import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcFunc {
	JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}
	public void setJt(JdbcTemplate jt) {
		this.jt=jt;
	}
	void createTable() {
		jt.execute("create table Students(Rollno int, Name varchar(40))");
		System.out.println("Table Created");
	}

}
