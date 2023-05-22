package lists;

import java.util.*;

record GroceryItem(String name, String type, int count) {
	public GroceryItem(String name) {
		this(name, "Dairy", 1);
	}
}

public class ArrayLists {
	public static void main(String[] args) {
		GroceryItem[] items = new GroceryItem[3];
		items[0] = new GroceryItem("Milk");
		items[1] = new GroceryItem("apples", "Produce", 6);
		items[2] = new GroceryItem("Bread");
		
//		System.out.println(Arrays.toString(items));
		
		List<GroceryItem> gi = new ArrayList<>(Arrays.asList(new GroceryItem("Milk"), new GroceryItem("Butter")));
//		System.out.println(gi);
		
		String[] names = {"Dima", "Max", "Andrew"};
		List<String> namesList = List.of(names);
		
		System.out.println(namesList.getClass().getSimpleName());
		
		
		List<String> next = new ArrayList<>(List.of("Mustard", "Garlic", "Pepper", "Onion"));
		next.addAll(namesList);
//		next.sort(String::compareTo);
		next.remove(0);
		next.remove("Andrew");
		next.removeAll(List.of("Onion", "Pepper"));
		next.addAll(List.of("Jam", "Bread", "Butter", "Milk"));
		next.retainAll(List.of("Dima", "Jam", "Burger"));
		System.out.println(next);
		
		next.clear();
		System.out.println(next);
		System.out.println(next.isEmpty());
		
		
		next.addAll(List.of("Apples", "Milk", "Bread", "Butter", "Garlic", "Oranges"));
		next.sort(Comparator.naturalOrder());
		System.out.println(next);
		next.sort(Comparator.reverseOrder());
		System.out.println(next);
		
		String[] arrayFromList = next.toArray(new String[next.size()]);
	}
}
