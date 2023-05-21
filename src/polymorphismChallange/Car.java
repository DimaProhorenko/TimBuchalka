package polymorphismChallange;

public class Car {
	private String description;
	private String type;

	public Car(String description) {
		this.description = description;
		type = this.getClass().getSimpleName();
	}
	
	public String startEngine() {
		return type + " " + description + " -> startEngine()";
	}
	
	public String drive() {
		return type + " " + description + " -> drive()";
	}
	
	protected String runEngine() {
		return type + " " + description + " -> runEngine()";
	}
}
