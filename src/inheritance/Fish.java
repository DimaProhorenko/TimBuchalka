package inheritance;

public class Fish extends Animal {
	private int fins;
	private int gills;
	
	
	public Fish(String type, double weight, int fins, int gills) {
		super(type, "small", weight);
		this.fins = fins;
		this.gills = gills;
	}
	
	private void moveMuscles() {
		System.out.println("muscles moving");
	}
	
	private void moveBackfin() {
		System.out.println("backfin moving");
	}
	
	
	@Override
	public void move(String speed) {
		moveMuscles();
		if ("fast".equals(speed)) {
			moveBackfin();
		}
	}

	@Override
	public String toString() {
		return String.format("Fish [fins=%s, gills=%s, toString()=%s]", fins, gills, super.toString());
	}
	
}
