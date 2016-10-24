package some.program;

class Lesson3 {
	public static void main(String[] args) {
		
		Student student = new Student("John Doe", 12);
		Student student2 = new Student("Johnathan Doelsky", 92, 93);

		
		System.out.println(student);
				
		System.out.println(student2);
		student2.growImidiately();
		System.out.println(student2);
		student2.growImidiately();
		System.out.println(student2);
		
		System.out.println(Student.studentQty);
		

		
	}
}

class Student {
	public String name;
	public int age;
	public int deadAge = 94;
	
	public static int studentQty = 0;
	
	public Student(String name, int age, int deadAge) {
		this(name, age);
		this.deadAge = deadAge;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		
		studentQty++;
	}
	
	public String toString() {
		if (isAlreadyDead()) return "I was a student. I'm dead now.";
		return "I'm a student. My name is " + name + ", I'm " + age + " years old.";
	}
	
	public String getName() {
		return "Mr. " + name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isAlreadyDead() {
		return age >= deadAge;
	}
	
	public void growImidiately() {
		age++;
	}
}