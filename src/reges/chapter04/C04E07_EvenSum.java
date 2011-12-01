package reges.chapter04;

import java.util.Scanner;

public class C04E07_EvenSum {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		evenSumMax(console);
	}

	public static void evenSumMax(Scanner console) {
		int numberOfInts;
		int evenSum = 0;
		int evenMax = 0;
		int input;
		System.out.print("How many integers do you want to enter? ");
		numberOfInts = console.nextInt();

		for (int i = 0; i < numberOfInts; ++i) {
			
			System.out.print("Next integer? ");
			input = console.nextInt();
			
			if (input % 2 == 0) {
				evenSum += input;
			}
			
			if (input % 2 == 0 && input > evenMax){
				evenMax = input;
			}
		}
	
		System.out.print("Even sum = " + evenSum + ", even max = " + evenMax);
		
	}
}
