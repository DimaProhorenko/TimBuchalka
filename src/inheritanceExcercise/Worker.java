package inheritanceExcercise;

public class Worker {
	private String name;
	private String birthDate;
	private String endDate;
	
	
	public Worker(String name, String birthDate, String endDate) {
		this.name = name;
		this.birthDate = birthDate;
		this.endDate = endDate;
	}
	
	
	public int getAge() {
		System.out.println(name + " is * years old" );
		return 0;
	}
	
	public double collectPay() {
		System.out.println("Collecting payment");
		return 100;
	}
	
	public void terminate(String endDate) {
		System.out.println(name + " is terminated at " + endDate);
	}


	@Override
	public String toString() {
		return String.format("Worker [name=%s, birthDate=%s, endDate=%s]", name, birthDate, endDate);
	}
	
}
