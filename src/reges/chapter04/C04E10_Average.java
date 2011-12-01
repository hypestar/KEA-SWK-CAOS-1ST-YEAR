package reges.chapter04;

import java.util.*;

public class C04E10_Average {

	public static void main(String[] args) {
	int num1, num2;
	Scanner console = new Scanner(System.in);
	System.out.print("Enter the first integer : ");
	num1 = console.nextInt();
	System.out.print("Enter the second integer : ");
	num2 = console.nextInt();
	System.out.print("The average of the to integers = " + average(num1, num2));

	}

	public static double average(int num1, int num2){
		double average = (double)(num1 + num2) / 2;
		return average;
	}
}
