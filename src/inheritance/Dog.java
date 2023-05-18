package inheritance;

public class Dog extends Animal {
	private String earShape;
	private String tailShape;
	
	public Dog(String type, double weight) {
		this(type, weight, "Perky", "Curled");
	}
	
	
	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type, weight < 15 ? "small" : weight < 35 ? "medium" : "large", weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	
	public void bark() {
		System.out.println("Wooof");
	}
	
	public void run() {
		System.out.println("Dog's running");
	}
	
	public void walk() {
		System.out.println("Dog's walking");
	}
	
	public void wiggleTail() {
		System.out.println("Dog's wiggling tail");
	}
	
	@Override
	public void makeNoise() {
		bark();
	}
	
	@Override
	public void move(String speed) {
		if("slow".equals(speed)) {
			walk();
			wiggleTail();
		} else {
			run();
			bark();
		}
	}

	@Override
	public String toString() {
		return String.format("Dog [earShape=%s, tailShape=%s, toString()=%s]", earShape, tailShape, super.toString());
	}
	
	
	
}
