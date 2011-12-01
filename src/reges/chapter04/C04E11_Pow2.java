package reges.chapter04;

import java.util.*;

public class C04E11_Pow2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double base;
		int exp;
		
		System.out.print("Enter the base number (double) : ");
		base = console.nextDouble(); 
		System.out.print("Enter the exponent (integer) : ");
		exp = console.nextInt();
		System.out.print(base + "^" + exp + " = " + pow2(base, exp));

	}

	public static double pow2(double base, int exp) {
		double result = 1;

		if (exp >= 0) {
			for (int i = 0; i < exp; i++) {
				result *= base;
			}
		} else {
			exp *= -1; // make exp positive. without using Math.abs()
			for (int i = 0; i < exp; i++) {
				result *= base;
			}
			result = 1/result;

		}

		return result;

	}

}
