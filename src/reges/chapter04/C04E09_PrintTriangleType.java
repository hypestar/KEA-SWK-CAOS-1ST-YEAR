package reges.chapter04;

import java.util.Scanner;

public class C04E09_PrintTriangleType {

	public static void main(String[] args) {
		int a, b, c;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the length og side a = ");
		a = console.nextInt();
		System.out.print("Enter the length og side b = ");
		b = console.nextInt();
		System.out.print("Enter the length og side c = ");
		c = console.nextInt();
		isAValidTriangle(a, b, c);
		printTriangleType(a, b, c);
	}

	public static void printTriangleType(int a, int b, int c) {
		
		// a == b == c equilateral
		// a == b || b == c || a == c isosceles
		// a != b && b != c && a != c scalene
		
		
		if (a == b && b == c) // equilateral all sides er equal
		{
			System.out.print("equilateral");
		}else if (a == b || b == c || a == c) 
		{
			System.out.print("isosceles");
		}else if (a != b && b != c && a != c) {
			System.out.print("scalene");
		}
		
	}
	
	public static void isAValidTriangle(int a,int b, int c){
			
		if (a>b && a>c && a>(b+c)){
			throw new IllegalArgumentException("side a (" + a +") is bigger than the sum of b(" + b + ") and c(" + c + ")");
		}else if (b>a && b>c && b>(a+c)){
			throw new IllegalArgumentException("side b (" + b +") is bigger than the sum of a(" + a + ") and c(" + c + ")");
		} else if (c>a && c>b && c>(a+b)) {
			throw new IllegalArgumentException("side c (" + c +") is bigger than the sum of a(" + a + ") and b(" + b + ")");
		}
		
	}
	
}
