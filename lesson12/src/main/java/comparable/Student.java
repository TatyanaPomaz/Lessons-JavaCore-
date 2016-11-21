package comparable;

public class Student implements Comparable {
	private int score;
	private String name;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return "Name: " + name+ "; score: " + score;
	}
	
	public int compareTo(Object o) {
		Student other = (Student)o;
		return 0;
	}
}