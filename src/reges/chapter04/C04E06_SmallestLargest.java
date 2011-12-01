package reges.chapter04;

import java.util.*;

public class C04E06_SmallestLargest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		smallestLargest(console);
	}

	public static void smallestLargest(Scanner console) {
		int numberOfInts, input;
		int smallest = 0;
		int largest = 0;

		System.out.print("How many integers do you want to enter? ");
		numberOfInts = console.nextInt();

		for (int i = 1; i <= numberOfInts; ++i) {

			System.out.print("Number " + i + ": ");
			input = console.nextInt();

			if (i == 1) { // the first number
				smallest = input;
				largest = input;
			} else if (input < smallest) {
				smallest = input;
			} else if (input > largest) {
				largest = input;
			}
		}
		System.out.println("Smallest = " + smallest);
		System.out.print("Largest = " + largest);
	}
}
