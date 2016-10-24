package jelenentary.people;

public class Student {
	private String name;
	private Group group;
	private School school;
	
	public Student() { }
	
	public Student(School school, Group group, String name) {
		this.group = group;
		this.school = school;
		this.name = name;
	}
	
	
	
	public String toString() {
		return "Student \'" + name + "\'";
	}
}