package arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Challenge1 {
	private Random rand = new Random();
	private Scanner scanner = new Scanner(System.in);
	
	public int[] generateRandomArray(int len) {
		int[] result = new int[len];
		for(int i=0;i<len;i++) {
			result[i] = rand.nextInt(100);
		}
		return result;
	}
	
	public int findMin(int[] arr) {
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public int[] readIntegers() {
		System.out.println("Enter length: ");
		int length = scanner.nextInt();
		int[] result = new int[length];
		
		for(int i = 0; i < length; i++) {
			System.out.println("Enter number: ");
			int num = scanner.nextInt();
			result[i] = num;
		}
		return result;
	}
	
	public int[] reverse(int[] arr) {
		int[] rs = new int[arr.length];
		int[] a = Arrays.copyOf(arr, arr.length);
		
		for(int i = arr.length-1, j=0; i >= 0; i--, j++) {
			rs[j] = arr[i];
		}
		
		return rs;
	}
	
	public static void main(String[] args) {
		Challenge1 c = new Challenge1();
		int[] arr = c.generateRandomArray(10);
		int[] userArr = c.readIntegers();
		System.out.println("Array" + Arrays.toString(c.reverse(userArr)));
		System.out.println(c.findMin(userArr));
	}
}
