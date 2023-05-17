package section7OOP;

public class Car {
	private String make;
	private String model;
	private String color;
	private int doors;
	private boolean convertible;
	
	
	
	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		if (make == null || make.length() == 0) this.make = "Unknown";
		else {
			this.make = make;
		}
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getDoors() {
		return doors;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	public boolean isConvertible() {
		return convertible;
	}



	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}



	public void describe() {
		System.out.println(String.format("Make: %s, model: %s, color: %s, doors: %d, %s", make, model, color, doors, convertible ? "Convertible" : ""));
	}
}
