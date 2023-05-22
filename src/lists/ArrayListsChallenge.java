package lists;
import java.util.*;


public class ArrayListsChallenge {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		while(true) {
			int action = getUserAction();
			if(action == 0) {
				break;
			}
			makeAction(action, list);
		}
		
		System.out.println(String.join(",", list));
	}
	
	public static int getUserAction() {
		int result = -1;
		while(true) {
			System.out.println("Available actions: ");
			System.out.println("0 - to shutdown\n1 - to add item(s) to list(comma delimeted list)\n2 - to remove any items (comma delimeted list)");
			System.out.println("Enter a number for which action you want: ");
			result = scanner.nextInt();
			if("012".contains(String.valueOf(result))) {
				break;
			}
		}
		scanner.nextLine();
		
		return result;
	}
	
	public static List<String> getItemsFromUser(String prompt) {
		System.out.println(prompt);
		String input = scanner.nextLine();
		return Arrays.stream(input.split(",")).map(el -> el.trim()).toList();
	}
	
	public static void makeAction(int action, List<String> list) {
		switch(action) {
		case 1:
			addToList(getItemsFromUser("Enter item(s) to add to list(comma delimeted list)"), list);
			System.out.println(list);
			break;
		case 2:
			if(list.size() == 0) {
				System.out.println("List is empty");
			} else {
				removeFromList(getItemsFromUser("Enter item(s) to delete from list(comma delimeted list): "), list);
				System.out.println(list);
			}
			
		}
	}
	
	public static void addToList(List<String> items, List<String> list) {
		list.addAll(items);
	}
	
	public static void removeFromList(List<String> items, List<String> list) {
		list.removeAll(items);
	}
}
