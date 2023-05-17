package section7OOP;

public class Account {
	private int number;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		double newAmount = this.balance - amount;
		if (newAmount < 0) System.out.println("Operation failed, withdraw amount can't be more than available balance!");
		else {
			this.balance = newAmount;
		}
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + ", name=" + name + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
