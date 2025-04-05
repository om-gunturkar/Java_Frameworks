package task1;

public class student {
	private String name;
	private int id;
	private int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void display() {
		System.out.println("Student Name "+name);
		System.out.println("Student id "+id);
		System.out.println("Student marks "+marks);

	}
}
