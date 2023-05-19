package encapsulation;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	
	public Printer(int tonerLevel, boolean duplex) {
		this.pagesPrinted = 0;
		this.tonerLevel = tonerLevel > 0 && tonerLevel < 100 ? tonerLevel : -1;
		this.duplex = duplex;
	}
	
	
	public int addToner(int amount) {
		int temp = tonerLevel + amount;
		if (temp < 0 || temp > 100) {
			return -1;
		}
		tonerLevel = temp;
		return tonerLevel ;
	}
	
	public int printPages(double pages) {
		int sheets = 0;
		if (duplex) {
			System.out.println("It's a duplex printer");
			sheets += Math.ceil(pages / 2);
		} else {
			sheets += pages;
		}
		pagesPrinted += sheets;
		return sheets;
	}


	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
	
}
