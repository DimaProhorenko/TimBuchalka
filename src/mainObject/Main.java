package mainObject;

public class Main {
	public static void main(String[] args) {
		Student dima = new Student("Dima", 23);
		PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 7, "Carrol");
				
		System.out.println(jimmy);
	}
}


class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Student {name: %s, age: %d}", name, age);
	}
}

class PrimarySchoolStudent extends Student {
	private String parentName;
	
	public PrimarySchoolStudent(String name, int age, String parentName) {
		super(name, age);
		this.parentName = parentName;
	}
	
	@Override
	public String toString() {
		return super.toString() + parentName;
	}
}
