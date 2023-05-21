package polymorphismChallange;

public class Main {
	public static void main(String[] args) {
		Car ford = new GasPoweredCar("Ford mustang", 8, 12);
		Car leaf = new ElectricCar("Nissan Leaf", 120, 90);
		System.out.println(ford.startEngine());
		System.out.println(ford.drive());
		System.out.println(leaf.startEngine());
		System.out.println(leaf.drive());
	}
}
