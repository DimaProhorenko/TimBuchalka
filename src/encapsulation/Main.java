package encapsulation;

public class Main {
	public static void main(String[] args) {
		Printer p = new Printer(50, true);
		System.out.println("Initial page count = " + p.getPagesPrinted());
		int pagesPrinted = p.printPages(5);
		p.printPages(20);
		System.out.printf("Current job pages: %s, total pages printed %s %n", pagesPrinted, p.getPagesPrinted());
	}
}
