package jelenentary;

public class Group {
	private School school;
	private String name;
	
	public Group() {
		
	}
	
	public Group(School school, String name) {
		this.school = school;
		this.name = name;
	}
	
	
	public String toString() {
		return "Group \'" + name + "\'";
	}	
}