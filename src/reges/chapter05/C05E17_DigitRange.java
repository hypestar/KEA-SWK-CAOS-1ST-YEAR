package reges.chapter05;

import java.util.ArrayList;
import java.util.Collections;

public class C05E17_DigitRange {

	public static void main(String[] args) {
		int num = 2;
		System.out.print(digitRange(num));
	
	}
	public static int digitRange(int num) {
		ArrayList<Integer> numbers = int2Array(num);//convert number to array
		Collections.sort(numbers);//sort ascending
		int highest = numbers.get(numbers.size()-1).intValue();//the last number is the highest
		int lowest = numbers.get(0).intValue();//the first number is the lowest
		return (highest - lowest) + 1;
		
	}
	public static int getIntLength(int num) {
		int n = 0;
		int i = 0;

		while (i < num) {
			i += Math.pow(10, n) * 9;
			n++;
		}
		return n;
	}

	public static ArrayList<Integer> int2Array(int num) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int x = 1; x <= getIntLength(num); x++) {
			numbers.add(numbers.size(), new Integer((int) (num % Math.pow(10, x))));
		}
		for (int i = numbers.size()-1; i > 0; i--) {
			numbers.set(i,new Integer((((numbers.get(i).intValue() - numbers.get(i-1).intValue())) / (int)Math.pow(10, i))) );
		}
		return numbers;
	}
}
