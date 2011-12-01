package reges.chapter04;

import java.util.Scanner;

public class C04E01_FractionSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter n (the number of terms) : ");
		n = console.nextInt();
    	System.out.print("The fraction sum = " +  fractionSum(n));
		
//		System.out.print("pow2(" + base + "," + exp + ") returns = " + pow2(base, exp

	}

	public static double fractionSum(int n){
		double theFractionSum = 0;
		
		for (int i = 1; i <= n; i++){
			theFractionSum += (double)1/i;
		}
		return theFractionSum;	
	}
}
