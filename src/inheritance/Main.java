package inheritance;

public class Main {
	public static void main(String[] args) {
//		doAnimalStuff(new Animal("Generic animal", "Huge", 400), "slow");
		Dog g = new Dog("German Shephard", 33.75, "Picky", "Straight");
		Dog a = new Dog("Rotweiller", 66);
		Fish goldie = new Fish("Goldie", 0.25, 2, 3);
//		doAnimalStuff(g, "fast");
//		doAnimalStuff(a, "slow");
		
		doAnimalStuff(goldie, "fast");
	}
	
	public static void doAnimalStuff(Animal animal, String speed) {
		animal.move(speed);
		animal.makeNoise();
		System.out.println(animal);
		System.out.println("------------------------------");
	}
}
