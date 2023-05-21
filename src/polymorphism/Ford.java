package polymorphism;

public class Ford extends Car {

	public Ford(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String startEngine() {
		String type = this.getClass().getSimpleName();
		return type + " -> startEngine";
	}
	
	@Override
	public String accelerate() {
		String type = this.getClass().getSimpleName();
		return type + " -> accelerate";
	}
	
	@Override
	public String brake() {
		String type = this.getClass().getSimpleName();
		return type + " -> brake";
	}
}
