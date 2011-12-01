package reges.chapter05;

import java.util.ArrayList;
import java.util.Collections;

public class C05E18_SwapDigits {

	public static void main(String[] args) {
		int num = 1234567;
		ArrayList<Integer> numbers = int2Array(num);
		swapDigitPairs(numbers);
		num = array2Int(numbers);
		System.out.println(num);
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

	public static ArrayList<Integer> swapDigitPairs(ArrayList<Integer> numbers){
		int numOfDigitPairs = numbers.size()/2;
		int pair=0;
		
		for (int i = 0;i < numOfDigitPairs ;i++) {
			Collections.swap(numbers,pair ,pair+1 );
			pair += 2;
		}
		return numbers;
	}

	public static int array2Int(ArrayList<Integer> numbers){
		int num = 0;
		
		for (int i = 0; i < numbers.size();i++){
		num += numbers.get(i)* (int)Math.pow(10, i);
		}
		return num;
	}
}
