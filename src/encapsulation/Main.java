package encapsulation;

public class Main {
	public static void main(String[] args) {
		Player p = new Player();
		p.name = "Tim";
		p.health = 20;
		p.weapon = "sword";
		
		int damage = 10;
		p.looseHealth(damage);
		p.looseHealth(12);
		System.out.println("REMAINING HEALTH: " + p.healthRemaining());
	}
}
