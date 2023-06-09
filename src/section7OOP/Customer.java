package section7OOP;

public class Customer {
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	public Customer() {
		this("Default name", "default@gmail.com");
	}
	
	public Customer(String name, String emailAddress) {
		this(name, 0.0, emailAddress);
	}
	

	public Customer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	
	
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", creditLimit=" + creditLimit + ", emailAddress=" + emailAddress + "]";
	}
	
	
}
