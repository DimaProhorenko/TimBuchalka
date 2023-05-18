package mainObject;

public class Main {
	public static void main(String[] args) {
		Student dima = new Student("Dima", 23);
		System.out.println(dima);
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
